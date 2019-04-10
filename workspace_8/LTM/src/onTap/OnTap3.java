package onTap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class OnTap3 {
	public void copyFile(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int i;
		File file = new File(source);
		if (file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			out.flush();
			out.close();
			in.close();
		}
	}

	public void copyFolder(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int i;
		File file = new File(source);
		dest += "\\" + file.getName();
		if (file.isDirectory()) {
			File folder = new File(dest);
			folder.mkdirs();
			File[] fileList = file.listFiles();
			for (File f : fileList) {
				copyFolder(f.getAbsolutePath(), dest);
			}
		} else if (file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName()));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			out.flush();
			out.close();
			in.close();
		}
	}

	public void splitFile(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		if (file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				count += i;
				out.write(data, 0, i);
				if (count >= 10240000) {
					count = 0;
					countFile++;
					out.flush();
					out.close();
					out = new BufferedOutputStream(
							new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile)));
				}
			}
			out.flush();
			out.close();
			in.close();
		}
	}

	public void splitFile2(String source, String dest, int number) throws IOException {
		byte[] data = new byte[102400];
		int i, count = 0, countFile = 1;
		File file = new File(source);
		long fileSize = file.length() / number;
		if (file.isFile()) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(dest + "\\" + file.getName() + countFile));
			while ((i = in.read(data)) != -1) {
				count += i;
				out.write(data, 0, i);
				if (count >= fileSize) {
					count = 0;
					countFile++;
					out.flush();
					out.close();
					out = new BufferedOutputStream(new FileOutputStream(dest + "\\" + file.getName() + countFile));
				}
			}
			out.flush();
			out.close();
			in.close();
		}
	}

	public void joinFile(String source, String dest) throws IOException {
		byte[] data = new byte[102400];
		int i;
		File file = new File(source);
		File[] fileList = file.listFiles();
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		for (File f : fileList) {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
			while ((i = in.read(data)) != -1) {
				out.write(data, 0, i);
			}
			in.close();
		}
		out.flush();
		out.close();
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
				out.seek(pos);
				out.writeUTF(listFile.get(i).getName());
				out.writeLong(listFile.get(i).length());
				FileInputStream in = new FileInputStream(listFile.get(i));
				transferPack(in, out, listFile.get(i).length());
				in.close();
			}
		}
		out.close();
	}

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

	public void Unpack(String source, String name, String dest) throws IOException {
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
				FileOutputStream out = new FileOutputStream(fileName);
				transferUnpack(in, out, fileSize);
				out.close();
			}
		}
		in.close();
	}
}
