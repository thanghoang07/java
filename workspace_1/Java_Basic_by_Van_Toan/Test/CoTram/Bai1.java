package CoTram;

public class Bai1 {

	public static void main(String[] args) {
		int k = 0, n, dem, j = 0;// khai bao cac bien, dat ja tri ban dau cho
									// cac bien can thiet
		while (j < 15) // trong khi so nguyen to da in < 15
		{
			k++; // cong cho k 1 don vi
			dem = 0; // reset gia tri cua bien dem =0 ung voi moi ja tri cua k
			for (n = 2; n <= k; n++) {
				if (k % n == 0) {
					dem++;
				}
			}
			if (dem == 1) {
				System.out.print(k + "  ");
				j++;// so lan in duoc cong them 1

			}
		}
	}
}
