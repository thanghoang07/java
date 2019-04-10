package bt1;

import java.io.File;

public class BaiTap1 {
	public boolean delete(String path) {
		// toa file
		File filePath = new File(path);
		// kiem tra ton tai
		if (!filePath.exists()) {
			System.out.println("ko ton tai");
			return false;
		}
		// xoa file
		if (filePath.isFile()) {
			System.out.println("xoa file");
			return filePath.delete();
		}
		// lay danh sach file trong thu muc
		File[] listFile = filePath.listFiles();
		// xoa thu muc
		if (listFile != null)
			for (File file : listFile) {
				System.out.println(file.getAbsolutePath());
				delete(file.getAbsolutePath());
			}
		return filePath.delete();
	}

	public boolean deleteNC(String path) {
		// toa file
		File filePath = new File(path);
		// kiem tra ton tai
		if (!filePath.exists()) {
			return false;
		}
		// xoa file
		if (filePath.isFile()) {
			System.out.println(filePath);
			return filePath.delete();
		}
		// lay danh sach file trong thu muc
		File[] listFile = filePath.listFiles();
		// xoa thu muc
		if (listFile != null)
			for (File file : listFile) {
				System.out.println(file.getAbsolutePath());
				deleteNC(file.getAbsolutePath());
			}
		return true;
	}

	public static void main(String[] args) {
		String path = "D:\\tmp";
		BaiTap1 bt1 = new BaiTap1();
		System.out.println(bt1.deleteNC(path));
	}
}
