package van_Toan;

import javax.swing.JFileChooser;

public class Test {
	public static void main(String[] args) {
		 String pathName = null;
		
		 JFileChooser file = new JFileChooser();
		 if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		 String filename = file.getSelectedFile().getName();
		 String dir = file.getCurrentDirectory().toString();
		 pathName = dir + "\\" + filename;
		
		 }
		System.out.println("Do Thi Vo Huong");
		 UndiretedGraph u = new UndiretedGraph();
		 u.matrix = u.readFile(pathName);
		int[][] matrix = u.readFile(pathName);
		 //u.viewGraph(matrix);

//		UndiretedGraph u = new UndiretedGraph(7);
//		u.addEdges(0, 1);
//		u.addEdges(0, 2);
//		u.addEdges(0, 6);
//		u.addEdges(1, 0);
//		u.addEdges(1, 2);
//		u.addEdges(1, 3);
//		u.addEdges(1, 5);
//		u.addEdges(2, 0);
//		u.addEdges(2, 1);
//		u.addEdges(2, 3);
//		u.addEdges(2, 6);
//		u.addEdges(3, 1);
//		u.addEdges(3, 2);
//		u.addEdges(3, 5);
//		u.addEdges(3, 6);
//		u.addEdges(4, 6);
//		u.addEdges(5, 1);
//		u.addEdges(5, 3);
//		u.addEdges(6, 0);
//		u.addEdges(6, 2);
//		u.addEdges(6, 3);
//		u.addEdges(6, 4);
//		
//		u.removeEdges(2, 3);
//		u.removeEdges(6, 3);
//		u.removeEdges(6, 4);
//		u.removeEdges(1, 5);
//		u.removeEdges(1, 3);
		
//		u.addEdges(0, 1);
//		u.addEdges(0, 2);
//		u.addEdges(1, 0);
//		u.addEdges(1, 2);
//		u.addEdges(2, 0);
//		u.addEdges(2, 1);
//		u.addEdges(3, 4);
//		u.addEdges(4, 3);
		
		//UndiretedGraph u = new UndiretedGraph();
	/*	u.addEdges(0, 1);
		u.addEdges(0, 2);
		u.addEdges(1, 0);
		u.addEdges(1, 2);
		u.addEdges(2, 0);
		u.addEdges(2, 1);
		u.addEdges(3, 4);
		u.addEdges(4, 3);*/
		
		u.viewGraph(u.matrix);
		
//		u.pathDFS(0, 3);
		u.isConnected();
		//System.out.println("isConnected: " + u.isConnected());
		/*System.out.println("checkConnected1: " + u.checkConnected1());
		System.out.println("checkConnected2: " + u.checkConnected2());*/
		System.out.println(u.countConnect());
		System.out.println(u.pathBFS(0, 3));
		/*System.out.println(u.pathDFS(0, 2));*/

//		System.out.println("so bac cua dinh 2 la: " + u.degreeVex(1));
//		System.out.println("tong so bac cac dinh cua do thi la: " + u.degreeGraph());
//		System.out.println("So canh cua do thi la: " + u.numEdge());
//		if (u.isConnected1())
//			System.out.println("Do thi da cho la do thi lien thong!");
//		else
//			System.out.println("Do thi da cho la do thi khong lien thong!");
//		System.out.println("Số thành phần liên thông : " + u.countConnect);
		
//		System.out.println("\nDo Thi Co Huong");
////		DiretedGraph d = new DiretedGraph();
////		int[][] matrix1 = d.readMatrix(pathName);
////		d.viewGraph(matrix1);
//		
//		DiretedGraph d = new DiretedGraph(5);
//		
//		d.addEdges(0, 1);
//		d.addEdges(1, 2);
//		d.addEdges(2, 3);
//		d.addEdges(0, 4);
//		d.addEdges(4, 0);
//		//d.removeEdges(1, 2);
//		d.viewGraph(d.matrix);
//		System.out
//				.println("Nua bac trong cua dinh 2 la: " + d.din(1));
//		System.out.println("Nua bac ngoai cua dinh 2 la: " + d.dout(1));
//		System.out.println("tong bac cua dinh la: " + d.degreeGraph());
//		System.out.println("So cung cua do thi la: " + d.numEdge());
//		if (d.isConnected())
//			System.out.println("Do thi da cho la do thi lien thong!");
//		else
//			System.out.println("Do thi da cho la do thi khong lien thong!");
	}
}
