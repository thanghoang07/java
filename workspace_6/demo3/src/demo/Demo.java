package demo;

public class Demo {
	public static void main(String[] args) {
		System.out.println("aaa");
		int[] listIntPager = {0, 1, 2, 3, 4};

		for (int i = 0; i < listIntPager.length; i++) {
			int pager = listIntPager[i];
			//
			if (pager == i && listIntPager[i] == (listIntPager[i])) {
				System.out.println("trang " + i);
			}
		}
	}
}
