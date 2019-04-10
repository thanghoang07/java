package lab5_by_thanh_hai;

public class Bai1 {
	public static void main(String[] args) {
		ArrayStack<Integer> arrStack = new ArrayStack<>(6);
		
		arrStack.push(1);
		arrStack.push(2);
		arrStack.push(4);
		arrStack.push(5);
		arrStack.push(7);
		arrStack.push(9);
		
		System.out.print("\t-----Mang so nguyen-----");
		
		System.out.print("\nmang A: " + arrStack.toString());
		System.out.print("\nsize: " + arrStack.size());
		System.out.print("\npop: " + arrStack.pop());//test pop
		System.out.print("\ntop: " + arrStack.top());
		System.out.print("\nmang A: " + arrStack.toString());
		System.out.print("\nsize: " + arrStack.size());
		arrStack.clear();
		System.out.println("\nmang A sau khi xoa: " + arrStack.toString());
		
		System.out.print("\n\t-----Mang ky tu-----");
		
		ArrayStack<String> arrStack2 = new ArrayStack<>(5);
		
		arrStack2.push("One");
		arrStack2.push("Two");
		System.out.print("\nsize: " + arrStack2.size());
		System.out.println("\nmang A: " + arrStack2.toString());
		
		System.out.print("\n\t\t------Danh Sach Lien Ket------");
		
		ListStack<String> listString = new ListStack<String>();
		listString.push("Nguyen Thanh Hai");
		listString.push("Nguyen Hoai Phung");
		listString.push("Le My Nhan");
		System.out.print("\nDanhSach: " + listString.toString());
		System.out.print("\nsize: " + listString.size());
		System.out.print("\npop: " + listString.pop());
		System.out.print("\ntop: " + listString.top());
		System.out.print("\nDanhSach: " + listString.toString());
		System.out.print("\nsize: " + listString.size());
		listString.clear();
		System.out.print("\nDanhSach sau khi xoa: " + listString.toString());
	}
}
