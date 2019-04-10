package ly_thuyet_do_thi_3_saving;

import java.io.File;
import javax.swing.JFileChooser;

public abstract class GraphTheory {
	protected static File file;

	// - Phương thức truyen ma trận kề
	public abstract int[][] readMatrix(File fileName);

	// - Phương thức in ma trận kề
	public abstract void printGraph(int[][] matrix);

	// - Phuong thuc them một cạnh ma trận kề
	public abstract void addEgdes(int src, int dest);

	// - Phuong thc xoa bo mot canh ma trận kề
	public abstract void removeEdges(int src, int dest);

	// - Phuong thuc tinh tong bac cua do thi ma trận kề
	public abstract int degreeGraph() throws Exception;

	// - Phuong thuc tinh so canh cua do thi ma trận kề
	public abstract int numEdges() throws Exception;

	// - Phuong thuc kiem tra tinh lien thong ma trận kề
	public abstract boolean isConnected();

	// - Phuong thuc dem thanh phan lien thong ma trận kề
	public abstract int countConnected();

	// - Phương thức truyen ma trận liên thuộc
	public abstract int[][] readIncidenceMatrix(File fileName);

	// - Phương thức doc file
	public static File docFile() throws Exception {
		try {
			JFileChooser fc = new JFileChooser();
			fc.setCurrentDirectory(new File("C:\\Users\\thang\\Desktop\\files\\G"));// dat_vi_tri_mac_dinh_de_mo
			fc.setDialogTitle("chon file chua do thi.");
			fc.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
			fc.setAcceptAllFileFilterUsed(false);
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				String selOpen = fc.getSelectedFile().getAbsolutePath();// lay_duong_dan_file
				file = new File(selOpen);
			} else {
				System.out.println("No file selection");
			}
		} catch (Exception a) {
			a.printStackTrace();
		}
		return file;
	}
}
