package demo_linked_list;

public interface LinkedListinterface<T>
{

	public void chenVaoDau(T item);

	public void chenVaoCuoi(T item);

	public void chenVao(T item, int index);
	
	public void chenNhieu(T[] a);

	public void xoa(T key);
	
	public void xoaPhanTuDau();
	
	public void xoaPhanTuCuoi(T key);
	
	public int size();
	
	public int thayDoiMotNode(T item);
	
	public void layMotNode(int index);

	public String toString();
	
	public void inRa();

}
