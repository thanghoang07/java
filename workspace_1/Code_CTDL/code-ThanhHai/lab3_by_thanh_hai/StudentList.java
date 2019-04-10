package lab3_by_thanh_hai;

public class StudentList<T extends SinhVien> {
	protected NodeSV<T> head;

	public StudentList() {
		head = null;
	}

	public void addFirst(SinhVien data) {
		NodeSV<T> newnNodeSV = new NodeSV<T>(data, head);
		head = newnNodeSV;
	}

	public void addLast(SinhVien data) {
		if (head == null)
			addFirst(data);
		else {
			NodeSV<T> tmp = head;
			while (tmp.next != null)
				tmp = tmp.next;
			tmp.next = new NodeSV<T>(data, null);
		}
	}

	public void add(SinhVien data, int index) {
		if (head == null || index <= 1)
			addFirst(data);
		else if (index > size())
			addLast(data);
		else {
			int i = 1;
			NodeSV<T> tmp = head;
			while (tmp != null) {
				i++;
				if (i == index) {
					tmp.next = new NodeSV<T>(data, tmp.next);
					break;
				}
				tmp = tmp.next;
			}
		}
	}

	public void search(String ten) {
		if (head == null)
			System.out.println("\ndanh sach rong");
		else {
			NodeSV<T> tmp = head;
			int i = 1;
			while (tmp != null && !tmp.getData().getTen().equals(ten)) {
				i++;
				tmp = tmp.next;
			}
			if (tmp == null)
				System.out.println("Khong co sinh vien can tim");
			else {
				System.out.println("\nSinh vien " + ten + " o vi tri: "
						+ i + " trong danh sach");
				System.out.println("Thong tin sinh vien " + ten + " la:\n"
						+ tmp.getData());
			}
		}
	}

	public void remove(String ten) {
		NodeSV<T> cur = head;
		NodeSV<T> prev = null;
		if(head.getData().getTen() == ten){
			head = head.next;
			return;
		}
		while (cur != null && !cur.getData().getTen().equals(ten)) {
			prev = cur;
			cur = cur.next;
		}
		if (cur == null)
			System.out.println("\nkhong co sinh vien nao ten " + ten);
		else {
			System.out.println("\nDanh sach sau khi xoa sinh vien " + ten
					+ " la : ");
			prev.next = cur.next;
		}
	}

	public int size() {
		NodeSV<T> tmp = head;
		int count = 0;
		while (tmp != null) {
			count++;
			tmp = tmp.next;
		}
		return count;
	}

	public String toString() {
		NodeSV<T> tmp = head;
		String str ="";
		while (tmp != null) {
			str += tmp.getData() + "\n";
			tmp = tmp.next;
		}
		return str;
	}

}
