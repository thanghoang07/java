package ly_thuyet_do_thi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public abstract class GraphTheory {
	protected static File file;
	protected static int[][] matrix;

	public GraphTheory() {

	}
	public void readMatrix(File fileName){
	
		try {
			Scanner sc = new Scanner(fileName);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				int size = Integer.parseInt(line);
				matrix = new int[size][size];
				for(int i=0;i< size;i++){
				   String s = sc.nextLine();
				   StringTokenizer token = new StringTokenizer(s);
				    for(int j=0;j<size;j++){
				    	matrix[i][j] = Integer.parseInt(token.nextToken());
				    }
				}
				
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						System.out.print(matrix[i][j] + " ");
					}
					System.out.println();
				}
			}
			
		} catch (FileNotFoundException e) {
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

	// - Phương thức kiểm tra liên thông
	public abstract boolean isConnected();

	// - Phương thức tính kích thước
	public abstract int size();

	// - Phương thức tính bậc của đỉnh
	public abstract int deg(int col);

	// - Phương thức tính số cạnh
	public abstract int canh();

	// - Phương thức in ma trận
	public abstract void printMatrix();
}