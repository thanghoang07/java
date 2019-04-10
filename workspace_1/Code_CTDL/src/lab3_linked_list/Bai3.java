package lab3_linked_list;

import java.util.NoSuchElementException;

public class Bai3<T> implements LinkedListInterface<T> {
		final static int ASD = 4;
		Node<T> dau;

		int size;

		// Constructors
		public Bai3() {
			size = 0;
		}

		public Bai3(Node<T> dau) {
			this.dau = dau;
			size = 0;
		}

		public Bai3(T headData) {
			dau = new Node<T>(headData);
			size = 0;
		}

		// Methods
		private void kiemTraPhanTuIndex(int index) {
			if (index < 0 || size <= index)
				throw new IndexOutOfBoundsException("Index: " + index + ", Khich thuoc: " + size);
		}

		private void kiemTraViTriIndex(int index) {
			if (index < 0 || size < index)
				throw new IndexOutOfBoundsException("Index: " + index + ", Khich thuoc: " + size);
		}

		public void themVaoDauDS(T item) {
			chenVaoDauDS(item);

		}

		@Override
		public void chenVaoDauDS(T item) {
			Node<T> newNode = new Node<T>(item);
			newNode.next = dau;
			dau = newNode;
			size++;
		}

		@Override
		public void themVaoCuoiDS(T item) {
			if (dau == null)
				chenVaoDauDS(item);
			else {
				Node<T> x = dau;
				while (x.next != null)
					x = x.next;

				x.next = new Node<T>(item);
				size++;
			}
		}

		@Override
		public void themVaoDS(int index, T item) {
			kiemTraViTriIndex(index);

			if (index == 0)
				chenVaoDauDS(item);
			else {
				Node<T> x = dau;
				for (int i = 0; i < index - 1; i++)
					x = x.next;

				x.next = new Node<T>(item, x.next);
				size++;
			}
		}

		@Override
		public T xoaPhanTuDauDS() {
			if (size == 0)
				throw new NoSuchElementException();
			else {
				Object temp = dau.getData();
				dau = dau.next;
				size--;
				return (T) temp;
			}
		}

		@Override
		public T xoaPhanTuCuoiDS() {
			if (size <= 1)
				return xoaPhanTuDauDS();
			else {
				Node<T> x = dau;

				while (x.next.next != null)
					x = x.next;

				Object temp = x.next.getData();
				x.next = null;
				size--;
				return (T) temp;
			}
		}

		@Override
		public void xoaPhanTu(int index) {
			Node<T> curr = dau;
			if (index == 0) {
				dau = dau.getNext();
			} else {
				for (int i = 1; i < index; i++) {
					curr = curr.getNext();
				}
				curr.setNext(curr.getNext().getNext());
			}
			this.size--;
		}

		@Override
		public T layMotNode(int index) {
			kiemTraPhanTuIndex(index);

			Node<T> x = dau;
			for (int i = 0; i < index; i++)
				x = x.next;

			return x.getData();
		}

		@Override
		public void thayDoiMotNode(int index, T item) {
			Node<T> cur = dau;
			for (int i = 0; i < index; i++) {
				cur = cur.getNext();
			}
			cur.setData(item);
		}

		@Override
		public int demSoNode() {
			int count = 0;
			Node<T> newNode = dau;
			while (newNode != null) {
				count++;
				newNode = newNode.next;
			}
			return count;
		}

		@Override
		public void inRaDS() {
			Node<T> tmp = dau;
			boolean isDone = false;
			while (!isDone) {
				System.out.print("|" + tmp.getData() + "|");
				if (tmp.getNext() == null) {
					isDone = true;
				}
				tmp = tmp.getNext();
			}
			System.out.println();
		}

		public int size() {
			return size;
		}

		public String toString() {
			return "[" + toString(dau) + "]";
		}

		public String toString(Node<T> item) {
			String tamS = " ";
			if (item != null) {
				tamS = item.getData().toString();
				if (item.next != null) {
					tamS = tamS + "," + toString(item.next);
				}
			}
			return tamS;
		}

		public void divideAt(Bai3<T> otherList,T key){
			
			Node<T> curr = dau;
			while((curr.next != null) && (!curr.next.getData().equals(key)))
					curr = curr.next;
			Node<T> tmp = curr.next;
			if(curr.next.getData().equals(key))
				curr.setNext(null);
			while(tmp != null){
				otherList.themVaoCuoiDS(tmp.getData());
				tmp = tmp.next;	
			}
		}

		public static void main(String[] args)
		{
			Bai3<Integer> list3 = new Bai3<Integer>();
			Bai3<Integer> list4 = new Bai3<Integer>();

			list3.themVaoDauDS(7);
			list3.themVaoDauDS(5);
			list3.themVaoDauDS(10);
			list3.themVaoDS(3, 4);
			list3.themVaoDS(4, 8);
			list3.themVaoDS(1, 9);
			list3.themVaoDS(0, 2);
			list3.themVaoCuoiDS(11);
			list3.themVaoCuoiDS(13);
			list3.themVaoCuoiDS(19);
			list3.inRaDS();

			System.out.println("1.In danh sach theo toString: \n" + list3);
			System.out.println("2.lay khich thuoc: " + list3.size());
			list3.divideAt(list4, ASD);
			System.out.println("3.\nChia thanh danh sach con tu so " + ASD +": \n" + list4);
			System.out.println("Danh sach con lai la: \n" + list3);
			
		}
		
}
