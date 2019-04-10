package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubsetsTest {
	//@Test
	public void testFindAll() {
		List<Integer> in = Arrays.asList(0, 1, 2, 3);

		List<List<Integer>> have = FindSubsets.findAll(in);

		List<List<Integer>> want = new ArrayList<List<Integer>>();
		want.add(new ArrayList<Integer>());
		want.add(Arrays.asList(3));
		want.add(Arrays.asList(2));
		want.add(Arrays.asList(2, 3));
		want.add(Arrays.asList(1));
		want.add(Arrays.asList(1, 3));
		want.add(Arrays.asList(1, 2));
		want.add(Arrays.asList(1, 2, 3));
		want.add(Arrays.asList(0));
		want.add(Arrays.asList(0, 3));
		want.add(Arrays.asList(0, 2));
		want.add(Arrays.asList(0, 2, 3));
		want.add(Arrays.asList(0, 1));
		want.add(Arrays.asList(0, 1, 3));
		want.add(Arrays.asList(0, 1, 2));
		want.add(Arrays.asList(0, 1, 2, 3));

		//assertEquals(want, have);
	}

	//@Test
	public void testFindAllFlat() {
		List<Integer> in = Arrays.asList(0, 1, 2, 3);

		List<List<Integer>> have = FindSubsets.findAllFlat(in);

		List<List<Integer>> want = new ArrayList<List<Integer>>();
		want.add(new ArrayList<Integer>());
		want.add(Arrays.asList(3));
		want.add(Arrays.asList(2));
		want.add(Arrays.asList(2, 3));
		want.add(Arrays.asList(1));
		want.add(Arrays.asList(1, 3));
		want.add(Arrays.asList(1, 2));
		want.add(Arrays.asList(1, 2, 3));
		want.add(Arrays.asList(0));
		want.add(Arrays.asList(0, 3));
		want.add(Arrays.asList(0, 2));
		want.add(Arrays.asList(0, 2, 3));
		want.add(Arrays.asList(0, 1));
		want.add(Arrays.asList(0, 1, 3));
		want.add(Arrays.asList(0, 1, 2));
		want.add(Arrays.asList(0, 1, 2, 3));

		//assertEquals(want, have);
	}
}
