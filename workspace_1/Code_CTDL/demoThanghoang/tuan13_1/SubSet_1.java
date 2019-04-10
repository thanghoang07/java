package tuan13_1;

import java.util.ArrayList;
import java.util.List;

public class SubSet_1 {
	ArrayList<List<Integer>> allSubset = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		SubSet_1 subSet = new SubSet_1();
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		subSet.getSubSet(set, 0);
		for (List<Integer> list : subSet.allSubset) {
			System.out.print("{");
			for (Integer element : list) {
				System.out.print(element);
			}
			System.out.println("}");
		}
	}

	public void getSubSet(ArrayList<Integer> set, int index) {
		if (set.size() == index) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			allSubset.add(temp);
		} else {
			getSubSet(set, index + 1);
			ArrayList<List<Integer>> tempAllSubsets = new ArrayList<List<Integer>>();
			for (List subset : allSubset) {
				ArrayList<Integer> newList = new ArrayList<Integer>();
				newList.addAll(subset);
				newList.add(set.get(index));
				tempAllSubsets.add(newList);
			}
			allSubset.addAll(tempAllSubsets);
		}
	}
}
