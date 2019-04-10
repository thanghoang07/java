/*package demo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DocFileMaTran2 extends JFrame {
	private DataInputStream bis;
	int[][] matrix;
	int size;

	public void docMaTran() {
		JFileChooser fc = new JFileChooser();
		int select = fc.showOpenDialog(this);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT Files", "txt");
		fc.addChoosableFileFilter(filter);
		try {
			if (select == JFileChooser.APPROVE_OPTION) {
				String selOpFile = fc.getSelectedFile().getAbsolutePath();
				String dirOpFile = fc.getCurrentDirectory().toString();
				String pathOpFile = dirOpFile + "\\" + selOpFile;
				File testFile = new File(pathOpFile);
				if (!testFile.isDirectory()) {
					String line = bis.readLine();
					size = Integer.parseInt(line);
					matrix = new int[size][size];
					for (int i = 0; i < size; i++) {
						String s = bis.readLine();
						StringTokenizer token = new StringTokenizer(s);
						for (int j = 0; j < size; j++) {
							matrix[i][j] = Integer.parseInt(token.nextToken());
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("file khong ton tai");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printMatrix() {
		for (int i = 0; i < ma; i++) {
			for (int j = 0; j < this.size(); j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
	}
}
*/