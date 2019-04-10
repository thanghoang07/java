package bt1;

import java.io.File;

public class BaiTap3 {
	private StringBuilder sb = new StringBuilder();
	private String space = "";

	public String dirTtree(String path) {
		// toa file
		File filePath = new File(path);
		// kiem tra ton tai
		if (!filePath.exists()) {
			System.out.println("khong ton tai");
		}
		String name = filePath.getName();
		if (filePath.isFile()) {
			name = "|---" + name.toLowerCase();
		}
		if (filePath.isDirectory()) {
			name = "|+--" + name.toUpperCase();
		}
		sb.append(name + "\n");
		// lay danh sach file trong thu muc
		File[] listFile = filePath.listFiles();

		if (listFile != null)
			for (File file : listFile) {
				space += " ";
				sb.append(space);
				dirTtree(file.getAbsolutePath());
				space = space.substring(0, space.length() - 1);
			}
		return sb.toString();
	}

	public static void main(String[] args) {
		String path = "D:\\tmp";
		BaiTap3 bt3 = new BaiTap3();
		System.out.println(bt3.dirTtree(path));
	}
}
