package demo_ly_thuyet_do_thi;

import java.io.File;
import javax.swing.UIManager;

public class Test {
	
	public static void main(String[] args) {	
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		File file = Graph.docFile();
		UndiretedGraph u = new UndiretedGraph();
		u.readMatrix(file);// doc_ma_tran
		u.printMatrix();//in_ma_tran
		/*System.out.println(u.canh());
		System.out.println(u.deg(2));
		u.addMatrix(1, 1);
		u.printMatrix();
		System.out.println(u.isConnected());
		System.out.println(u.isConnected_1());*/
		
		
	}
	
}
