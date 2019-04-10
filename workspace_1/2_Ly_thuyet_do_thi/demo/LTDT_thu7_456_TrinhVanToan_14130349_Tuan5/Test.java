package LTDT_thu7_456_TrinhVanToan_14130349_Tuan5;

public class Test {
	public static void main(String[] args) {
		UndiretedGraph u = new UndiretedGraph(5);
		u.addEdge(0, 1);
		u.addEdge(0, 2);
		u.addEdge(1, 4);
		u.addEdge(4, 3);
		u.addEdge(3, 2);
		
		System.out.println("1/ Kiem tra chu trinh Hamilton");
	//	u.viewGraph(u.matrix);
		u.checkHamilton();
		System.out.println(u.countConnect());
		System.out.println("--------------");
		UndiretedGraph u1 = new UndiretedGraph(5);
		u1.addEdge(0, 1);
		u1.addEdge(0, 2);
		u1.addEdge(1, 4);
		u1.addEdge(4, 3);
		u1.addEdge(3, 2);
		
		//u1.viewGraph(u1.matrix);
		System.out.println(u1.countConnect());
		System.out.println("2/ In ra tat ca chu trinh Hamilton");
		u1.allCycleHamilton(4);
		System.out.println("3/ In ra 1 chu trinh Hamilton");
		u1.oneCycleHamilton(4);
		
		System.out.println("--------------");
		UndiretedGraph u2 = new UndiretedGraph(6);
		u2.addEdge(0, 4);
		u2.addEdge(0, 1);
		u2.addEdge(0, 5);
		u2.addEdge(1, 2);
		u2.addEdge(1, 3);
		u2.addEdge(2, 3);
		u2.addEdge(4, 5);
		
		//u2.viewGraph(u2.matrix);
		System.out.println(u2.countConnect());
		System.out.println("4/ In ra tat ca duong di Hamilton");
		u2.allCycleHamilton(5);
		
	}
}
