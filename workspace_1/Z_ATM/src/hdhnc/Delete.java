package hdhnc;

import java.io.File;

public class Delete {
	static int lever = 0;

	public boolean delete(String path) {
		File file = new File(path);
		if (!file.exists())
			return false;
		if (file.isFile())
			return file.delete();
		else {
			File[] list = file.listFiles();
			if (list != null) {
				for (File f : list) {
					delete(f.getAbsolutePath());
				}
			}
		}
		return file.delete();
	}

	public void dirTree(String path) {
		File file = new File(path);
		if (!file.exists())
			System.out.println("Duong dan khong dung");
		System.out.println(out() + file.getName());
		if (!file.isFile()) {
			File[] list = file.listFiles();
			if (list != null) {
				lever++;
				for (File f : list) {
					dirTree(f.getAbsolutePath());
				}
				lever--;
			}

		}
	}

	public int sizeDir(String path) {
		int count = 0;
		File file = new File(path);
		String tem[] = file.list();
		for (int i = 0; i < tem.length; i++) {
			File f = new File(path + "\\" + tem[i]);
			if (f.isFile())
				count += f.length() / 1024;
			else
				count += sizeDir(f.getPath());
		}
		return count;
	}

	public String out() {
		String temp = "|-";
		for (int i = 0; i < lever; i++) {
			temp += "+--";
		}
		return temp;

	}

	public static void main(String[] args) {
		String path = "D:\\toan";
		Delete d = new Delete();
		d.dirTree(path);
	}

}
