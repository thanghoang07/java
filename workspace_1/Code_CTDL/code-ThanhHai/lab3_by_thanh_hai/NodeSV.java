package lab3_by_thanh_hai;

public class NodeSV<T extends SinhVien> {
	private SinhVien data;
	public NodeSV<T> next;

	public NodeSV(SinhVien data, NodeSV<T> next) {
		this.data = data;
		this.next = next;
	}

	public SinhVien getData() {
		return data;
	}

	public void setData(SinhVien data) {
		this.data = data;
	}

}
