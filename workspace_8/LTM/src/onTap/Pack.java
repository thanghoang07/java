package onTap;

import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Pack {
	public void transfer(FileInputStream in, DataOutput out, long length) throws IOException {
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
			File[] list = file.listFiles();
			List<File> listFile = new ArrayList<File>();
			for (File f : list) {
				if (f.isFile()) {
					listFile.add(f);
				}
			}
			out.writeInt(listFile.size());
			for (int i = 0; i < listFile.size(); i++) {
				out.writeLong(0);
			}
			for (int i = 0; i < listFile.size(); i++) {
				// cập nhật vị trí file n cho header
				pos = out.getFilePointer();// vị trí n*file
				out.seek(4 + i * 8);// seek to n*pos
				out.writeLong(pos);// rewrite
				out.seek(pos);
				out.writeUTF(listFile.get(i).getName());
				out.writeLong(listFile.get(i).length());
				FileInputStream in = new FileInputStream(listFile.get(i));
				transfer(in, out, listFile.get(i).length());
				in.close();
			}
			out.close();
		}
	}
}
