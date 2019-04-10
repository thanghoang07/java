package tuan1;

// lop buffferImpl la mot mang co dinh kich thuoc
public class BufferImpl<E> implements Buffer<E> {
	private static final int BUFFER_SIZE = 5;
	private E[] elements;
	private int in, out, count;

	public BufferImpl() {
		count = 0;
		in = 0;
		out = 0;
		E[] elm = (E[]) (new Object[BUFFER_SIZE]);
		elements = elm;
	}

	@Override
	public void insert(E item) {
		/*
		 * if (count > BUFFER_SIZE) { elements[count] = null;
		 * System.out.println("loi"); } elements[count] = item; count++;
		 */
		while (count == BUFFER_SIZE);
		elements[in] = item;
		in = (in + 1) % BUFFER_SIZE;
		++count;

	}

	@Override
	public E remote() {
		E item = null;
		while (count == 0);
			item = elements[out];
			out = (out + 1) % BUFFER_SIZE;
			--count;

		
		return item;
	}

	public void print() {
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + " ");
		}
	}

	public static void main(String[] args) {
		BufferImpl<String> bf = new BufferImpl<>();
		bf.insert("Demo");
		bf.insert("Live");
		bf.insert("Demo");
		bf.insert("Live");
		bf.insert("Demo");
		bf.insert("Live");
		bf.print();
	}
}
