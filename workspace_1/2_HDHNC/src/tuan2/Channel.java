package tuan2;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

// chua cac item
public abstract class Channel {
	/*public LinkedList<Integer> list;
	public Producer pder;
	int num = 1000;

	public Channel(Producer pd) {
		this.pder = pd;
		this.list = new LinkedList<>();
	}
	public void inputItem(Producer pd){
		list.addAll((Collection<? extends Integer>) pd);
	}
	public Channel() {
		super();
	}
	public void Output() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.peek();
	}*/
	public static final Queue<Integer> queue = new LinkedList<>();
}
