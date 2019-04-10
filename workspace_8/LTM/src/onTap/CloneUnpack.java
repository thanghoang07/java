package onTap;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CloneUnpack {
	private void transfer(RandomAccessFile in, FileOutputStream out, long length) throws IOException {
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
				transfer(in, out, fileSize);
				out.close();
			}
		}
		in.close();
	}
}
