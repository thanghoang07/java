package demo_2_2_1;

public class DoubleNode<Double> {
	protected double data;
	protected DoubleNode<Double> next;
	
	
	public DoubleNode(double data)
	{
		this.data = data;
	}
	public DoubleNode(double value, DoubleNode<Double> head)
	{
		data = value;
        head = next;
	}
	public void displayNode()
	{
		System.out.print(data + " ");
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public DoubleNode<Double> getNext() {
		return next;
	}
	public void setNext(DoubleNode<Double> next) {
		this.next = next;
	}
	
	
}
