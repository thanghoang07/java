package tuan5;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class SinhVien {
	private int mssv;
	private String tenSV;
	private List<MonHoc> listMon;
	private static RandomAccessFile raf;

	public SinhVien() {
		
	}
	
	public SinhVien(int maSV, String tenSV, List<MonHoc> listMon) {
		this.mssv = maSV;
		this.tenSV = tenSV;
		this.listMon = listMon;
	}

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public List<MonHoc> getListMon() {
		return listMon;
	}

	public void setListMon(List<MonHoc> listMon) {
		this.listMon = listMon;
	}

	public String sinhVien() {
		StringBuffer sb = new StringBuffer();
		sb.append(mssv + "||" + tenSV + "|--|" + listMon.size() + "||");
		for (int i = 0; i < listMon.size(); i++) {
			sb.append(listMon.get(i).toString());
		}
		return sb.toString();
	}
	public void writeFile(String dest, List<SinhVien> listSv) throws IOException {
		raf = new RandomAccessFile(new File(dest), "rw");
		raf.writeInt(listSv.size());
		//
		for (int i = 0; i < listSv.size(); i++) {
			raf.writeLong(0);// vị trí bắt đầu để write nội dung của 1 sinh viên
		}
		//
		long pos;
		for (int i = 0; i < listSv.size(); i++) {
			pos = raf.getFilePointer();
			raf.seek(4 + i * 8);// là quay về được trí con trỏ của writeLong cho từng sinh viên, bắt đầu để
								// write sinh viên thứ i
			raf.writeLong(pos);
			raf.seek(pos);// seek là đưa con trỏ về vị trí byte bất kì
			raf.writeInt(listSv.get(i).getMssv());
			raf.writeUTF(listSv.get(i).getTenSV());
			raf.writeInt(listSv.get(i).getListMon().size());
			//
			for (int n = 0; n < listSv.get(i).getListMon().size(); n++) {
				MonHoc mh = listSv.get(i).getListMon().get(n);
				raf.writeUTF(mh.toString());
			}
			//
		}
	}

	public String getOneSinhVien(int mSV, String source) throws IOException {
		raf = new RandomAccessFile(source, "rw");
		SinhVien st = null;
		List<MonHoc> list = new ArrayList<>();
		int slsv = raf.readInt();
		long pos;
		for (int i = 0; i < slsv; i++) {
			raf.seek(4 + i * 8);
			pos = raf.readLong();
			raf.seek(pos);
			int msvien = raf.readInt();
			if (msvien == mSV) {
				String ten = raf.readUTF();
				int slmh = raf.readInt();
				for (int n = 0; n < slmh; n++) {
					MonHoc mh = new MonHoc().mhocToken(raf.readUTF());
					list.add(mh);
				}
				st = new SinhVien(msvien, ten, list);
			}
		}
		return st.sinhVien();
	}

	public List<SinhVien> getListSinhVien(String source) throws IOException {
		raf = new RandomAccessFile(source, "rw");
		List<SinhVien> list = new ArrayList<SinhVien>();
		SinhVien st = null;
		List<MonHoc> listMH = new ArrayList<MonHoc>();
		int slsv = raf.readInt();
		long pos;
		for (int i = 0; i < slsv; i++) {
			raf.seek(4 + i * 8);
			pos = raf.readLong();
			raf.seek(pos);
			int mSV = raf.readInt();
			String tenSV = raf.readUTF();
			int slmhSV = raf.readInt();
			if (i == mSV) {
				for (int n = 0; n < slmhSV; n++) {
					MonHoc mh = new MonHoc().mhocToken(raf.readUTF());
					//
					listMH.add(mh);
				}
			}
			st = new SinhVien(mSV, tenSV, listMH);
			//
			list.add(st);
		}
		return list;
	}
}
