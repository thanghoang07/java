package ga_demo;
import java.util.*;
public class RandomBoards {

	ArrayList<BoardState> boards = new ArrayList<BoardState>();
	int[] original;

	public RandomBoards(int size, int puzzles) { // kich thuoc va so quan the
		original = new int[size];
		initialize(size);
		create(puzzles);
	}

	//Tao quan the ban dau
	public void create(int puzzles) {
		HashSet<String> set = new HashSet<String>();
		int[] copy = Arrays.copyOf(original,original.length);
		int i = 0;
		while(true) {
			String temp = Arrays.toString(copy);		
			if(set.add(temp)) {
				boards.add(new BoardState(copy));
				i++;
				if(i == puzzles) {	
					break;
				}
			}
			
			shuffleArray(copy);
		}	
	}

	//Vi tri cac con hau 
	public void initialize(int size) {
		for(int i = 0; i < size; i++) {
			original[i] = i;
		}
	}

	
	//Neu gia tri radom la chan chi doi cho
	//Neu gia tri le thi random lai
	public static void shuffleArray(int[] a) {
		int n = a.length;
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int change = i + random.nextInt(n - i);
			int totallyRandom = random.nextInt();
			if((totallyRandom%2) == 1) {//le
				a[i] = change;
			} else {
				swap(a, i, change);
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}