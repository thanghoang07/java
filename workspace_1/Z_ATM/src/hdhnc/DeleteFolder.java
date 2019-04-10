package hdhnc;

import java.io.File;

public class DeleteFolder {
	public static void main(String[] args) throws Exception {
		// File file = new
		// File("C:\\Users\\thang\\Desktop\\files\\files2\\dest_copyForder1");
		// delete(file);
		File file = new File("D:\\toanNew\\fq.txt");
		deleteFile(file);
	}

	public static void delete(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				delete(files[i]);
			}
		}
		System.out.println("Deleted: " + file.getPath());
		file.setWritable(true);
		file.delete();
	}

	public static void deleteFile(File file) {
		if (!file.exists()) {// kiểm tra sự tồn tại của file
			System.out.println("not done");
		} else {// thực hiện xóa file nếu file ko được dùng thì xóa ngược lại
				// thì ko xóa
			System.out.println(file.delete() ? ("Done") : ("file đang dùng"));
		}
	}
}