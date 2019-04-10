package demo_ly_thuyet_do_thi;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

public abstract class Graph {
	protected int[][] matrix;
	private DataInputStream bis;
	public static File file;

	public Graph() {
	}

	public abstract boolean isEuler();

	public abstract void removeCanh(int i, int j);

	public abstract void printEuler();

	public abstract boolean isTree();

	public abstract int doLechTam();

	@SuppressWarnings("deprecation")
	public void readMatrix(File fileName) {
		try {
			bis = new DataInputStream(new FileInputStream(fileName));
			String line = bis.readLine();
			int size = Integer.parseInt(line);// lay_size
			matrix = new int[size][size];// tao_ma_tran
			String sLine = bis.readLine();
			StringTokenizer token = new StringTokenizer(sLine);// chia_mang_string_thanh_tung_phan_tu
			// System.out.println("dddd: " + token.countTokens());
			for (int i = 0; i < size; i++) {
				while (token.hasMoreTokens()) {
					for (int j = 0; j < size; j++) {
						matrix[i][j] = Integer.parseInt(token.nextToken());
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

	public static File docFile() {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("C:\\Users\\thang\\Desktop\\files"));// dat_vi_tri_mac_dinh_de_mo
		fc.setDialogTitle("chon file chua do thi.");
		fc.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
		fc.setAcceptAllFileFilterUsed(false);
		if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			String selOpen = fc.getSelectedFile().getAbsolutePath();// lay_duong_dan_file
			file = new File(selOpen);
		} else {
			System.out.println("No selection");
		}
		return file;
	}
	
	public abstract boolean isConnected_1();
	
	public abstract void addMatrix(int col, int row);

	public abstract int size();

	public abstract int deg(int col);

	public abstract int canh();

	public abstract void printMatrix();
}
