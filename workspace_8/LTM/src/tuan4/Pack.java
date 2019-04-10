package tuan4;

import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Pack {

	public static void pack(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int byteRead;
		//
		File file = new File(source);
		if (!file.exists()) {// kiem tra ton tai
			return;
		}
		//
		File[] list = file.listFiles();
		ArrayList<File> listFile = new ArrayList<File>();
		//
		if (list != null || list.length == 0) {
			for (File f : list) {
				if (f.isFile()) {
					listFile.add(f);
				}
			}
		}
		RandomAccessFile raf = new RandomAccessFile(dest, "rw");
		raf.writeInt(listFile.size());
		for (int i = 0; i < listFile.size(); i++) {
			raf.writeLong(0);
		}
		long pos;
		for (int i = 0; i < listFile.size(); i++) {
			pos = raf.getFilePointer();
			//
			raf.seek(4 + 8 * i);
			raf.writeLong(pos);
			raf.seek(pos);
			raf.writeUTF(listFile.get(i).getName());
			raf.writeLong(listFile.get(i).length());
			FileInputStream input = new FileInputStream(listFile.get(i));
			//
			long remain = listFile.get(i).length();
			long byteMustRead = data.length;
			while (remain > 0) {
				byteRead = input.read(data, 0, (int) byteMustRead);
				raf.write(data, 0, byteRead);
				remain -= byteRead;
				byteMustRead = ((remain < data.length) ? remain : data.length);
			}
			//
			input.close();
		}
		raf.close();
		System.out.println("done");
	}

	public static void extract(String archire, String fname, String dir) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(archire, "rw");
		File file = new File(dir, fname);
		//
		int n = raf.readInt();
		for (int i = 0; i < n; i++) {
			raf.seek(4 + i * 8);
			long pos = raf.readLong();
			raf.seek(pos);

			String name = raf.readUTF();
			System.out.println(name);
			if (fname.equalsIgnoreCase(name)) {
				FileOutputStream output = new FileOutputStream(file);
				transfer(raf, output, raf.readLong());
				output.close();
			}
		}
		raf.close();
	}

	public static void transfer(RandomAccessFile archire, FileOutputStream out, long partSize) throws IOException {
		byte[] data = new byte[102400];
		int byteRead;
		long remain = partSize;
		long byteMustRead = data.length;
		while (remain > 0) {
			byteRead = archire.read(data, 0, (int) byteMustRead);
			out.write(data, 0, byteRead);
			remain -= byteRead;
			byteMustRead = ((remain < data.length) ? remain : data.length);
		}
		out.close();
	}

	public static void main(String[] args) throws IOException {
		String source = "E:\\thanghoang";
		String dest = "D:\\thanghoang\\abcd.pack";
		pack(dest, source);
		//extract(dest, "test.txt", "D:\\thanghoang\\thanghoang");
	}
}