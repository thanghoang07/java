package tuan1;

import java.util.Vector;

public class MessageQueue<E> {
	private Vector<E> vector;
	private int in;

	public MessageQueue() {

	}

	public void send(E item) {
		vector.add(item);
		in++;
	}

	public E receive() {
		return vector.remove(in);

	}
	
}
