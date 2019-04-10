package demo_2;

public class Node {
	private int value;
	/*cac phuong gthuc khoi tao*/
	public Node(){
		value = 0;
	}
	public Node(int value){
		this.value = value;
	}
	/*phuong thuc truy nhap thuoc tinh value*/
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
}
