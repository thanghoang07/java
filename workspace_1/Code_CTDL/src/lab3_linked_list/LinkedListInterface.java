package lab3_linked_list;

public interface LinkedListInterface<T>
{
	//chen
	public void chenVaoDauDS(T item);
	public void themVaoCuoiDS(T item);
	public void themVaoDS(int index, T item);
	//xoa
	public T xoaPhanTuDauDS();
	public T xoaPhanTuCuoiDS();
	public void xoaPhanTu(int index);
	//lay va thay doi mot node
	public T layMotNode(int index);
	public void thayDoiMotNode(int index, T item);
	//in ra danh sach
	public void inRaDS();
	public String toString();
	//dem tan xuat
	public int demSoNode();
	
	
}
