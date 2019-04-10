package LTDT_thu7_456_TrinhVanToan_14130349_Tuan7;

public class TestTree {
	public static void main(String[] args) {

		System.out.println("===GRAPH TREE===");
		System.out.println("1. Test DFS");
		Tree tree = new Tree(9);
		tree.addEdge(0, 1);
		tree.addEdge(0, 5);
		tree.addEdge(1, 5);
		tree.addEdge(1, 4);
		tree.addEdge(1, 2);
		tree.addEdge(2, 4);
		tree.addEdge(2, 3);
		tree.addEdge(3, 4);
		tree.addEdge(4, 6);
		tree.addEdge(5, 6);
		tree.addEdge(6, 8);
		tree.addEdge(6, 7);

		tree.println(tree.preorder(0));

		Tree tree1 = new Tree(9);
		tree1.addEdge(0, 1);
		tree1.addEdge(0, 5);
		tree1.addEdge(1, 5);
		tree1.addEdge(1, 4);
		tree1.addEdge(1, 2);
		tree1.addEdge(2, 4);
		tree1.addEdge(2, 3);
		tree1.addEdge(3, 4);
		tree1.addEdge(4, 6);
		tree1.addEdge(5, 6);
		tree1.addEdge(6, 8);
		tree1.addEdge(6, 7);

		System.out.println("\n* Káº¿t quáº£ duyá»‡t theo Postorder :\n");
		tree1.println(tree1.postorder(0));

		Tree tree2 = new Tree(9);
		tree2.addEdge(0, 1);
		tree2.addEdge(0, 5);
		tree2.addEdge(1, 5);
		tree2.addEdge(1, 4);
		tree2.addEdge(1, 2);
		tree2.addEdge(2, 4);
		tree2.addEdge(2, 3);
		tree2.addEdge(3, 4);
		tree2.addEdge(4, 6);
		tree2.addEdge(5, 6);
		tree2.addEdge(6, 8);
		tree2.addEdge(6, 7);
		System.out.println("\n* Káº¿t quáº£ duyá»‡t theo Inorder :\n");
		tree2.println(tree2.inorder(0));

	}
}
