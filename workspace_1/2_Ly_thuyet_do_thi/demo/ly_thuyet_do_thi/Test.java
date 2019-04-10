package ly_thuyet_do_thi;

import java.io.File;
import javax.swing.UIManager;

public class Test {
	public static void main(String[] args) {	
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		File file = GraphTheory.docFile();
		UndirectedGraph u = new UndirectedGraph();
		u.readMatrix(file);// doc_ma_tran
		u.printMatrix();//in_ma_tran
		
		
		
	}
}
