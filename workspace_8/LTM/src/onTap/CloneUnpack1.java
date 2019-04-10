package onTap;

import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CloneUnpack1 {
	private void transferUnpack(RandomAccessFile in, FileOutputStream out, long length) throws IOException {
		byte[] data = new byte[102400];
		int i;
		long remain = length, byteRead = data.length;
		while (remain > 0) {
			i = in.read(data, 0, (int) byteRead);
			out.write(data, 0, i);
			remain -= i;
			byteRead = ((remain < data.length) ? remain : data.length);
		}
	}

	public void unpack(String source, String name, String dest) throws IOException {
		RandomAccessFile in = new RandomAccessFile(source, "rw");
		int number = in.readInt();
		long pos, fileSize;
		String fileName;
		for (int i = 0; i < number; i++) {
			in.seek(4 + i * 8);
			pos = in.readLong();
			in.seek(pos);
			fileName = in.readUTF();
			fileSize = in.readLong();
			if (fileName.equalsIgnoreCase(name)) {
				FileOutputStream out = new FileOutputStream(dest + "\\" + fileName);
				transferUnpack(in, out, fileSize);
				out.close();
			}
		}
		in.close();
	}

	private void transferPack(FileInputStream in, DataOutput out, long length) throws IOException {
		byte[] data = new byte[102400];
		int i;
		long remain = length, byteRead = data.length;
		while (remain > 0) {
			i = in.read(data, 0, (int) byteRead);
			out.write(data, 0, i);
			remain -= i;
			byteRead = ((remain < data.length) ? remain : data.length);
		}
	}

	public void pack(String source, String dest) throws IOException {
		long pos;
		File file = new File(source);
		RandomAccessFile out = new RandomAccessFile(dest, "rw");
		if (file.exists()) {
			File[] fileList = file.listFiles();
			List<File> listFile = new ArrayList<File>();
			for (File f : fileList) {
				if (f.isFile()) {
					listFile.add(f);
				}
			}
			out.writeInt(listFile.size());
			for (int i = 0; i < listFile.size(); i++) {
				out.writeLong(0);
			}
			for (int i = 0; i < listFile.size(); i++) {
				pos = out.getFilePointer();
				out.seek(4 + i * 8);
				out.writeLong(pos);
				out.writeUTF(listFile.get(i).getName());
				out.writeLong(listFile.get(i).length());
				FileInputStream in = new FileInputStream(listFile.get(i));
				transferPack(in, out, listFile.get(i).length());
				in.close();
			}
			out.close();
		}
	}
}
