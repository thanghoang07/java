package hdhnc;

import java.io.File;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] argv) throws Exception {
		JFileChooser chooser = new JFileChooser();
		File f = new File(new File("D:\\toan\\fq.txt").getCanonicalPath());
		chooser.setSelectedFile(f);
		//chooser.showOpenDialog(null);
		File curFile = chooser.getSelectedFile();
		System.out.println(curFile);
	}
}