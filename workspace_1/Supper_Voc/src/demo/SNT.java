package demo;

public class SNT {
	static int[] nt;

	public static void sangnt(int n) { // đánh_dấu_các_số_nguyên_tố_nhỏ_hơn_n
		int i, k;
		for (i = 2; i < n; i++)
			if (nt[i] == 0) // nếu_i_là_số_nguyên_tố_thì_các_bội_của_i_sẽ_là_hợp_số
			{
				k = 2; // đánh dấu các bội số của i
				while (k * i < n) {
					nt[i * k++] = 1;
				}
			}
	}
	public static void main(String[] args) {
		int n =8;
		System.out.println();
		SNT.sangnt(n);
	}
}
