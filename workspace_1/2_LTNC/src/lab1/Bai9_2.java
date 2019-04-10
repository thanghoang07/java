package lab1;

public class Bai9_2 {
	public static void tamGiac(int canhA, int canhB, int canhC) {
		if (canhA != 0 && canhB != 0 && canhC != 0) {
			int Ax1 = canhA * canhA;
			int Ax2 = canhB * canhB;
			int Ax3 = canhC * canhC;
			if (canhA + canhB > canhC || canhA + canhC > canhB || canhB + canhC > canhA) {
				System.out.println("Day la hinh tam giac");
				if (Ax1 == Ax2 + Ax3) {
					System.out.println("0 tam giac vuong");
					System.out.printf("co canh huyen la: %s \nhai canh goc vuong la: %s va %s", canhA, canhB, canhC);
				} else if (Ax2 == Ax1 + Ax3) {
					System.out.println("0 tam giac vuong");
					System.out.printf("co canh huyen la: %s \nhai canh goc vuong la: %s va %s", canhB, canhC, canhA);
				} else if (Ax3 == Ax2 + Ax1) {
					System.out.println("0 tam giac vuong");
					System.out.printf("co canh huyen la: %s \nhai canh goc vuong la: %s va %s", canhC, canhA, canhB);
				} else if (Ax1 == Ax2 && Ax3 == Ax2 + Ax1) {
					System.out.println("0 tam giac vuong can");
					System.out.printf("co canh huyen la: %s \nhai canh goc vuong bang nhau la: %s va %s", canhC, canhA,
							canhB);
				} else if (Ax3 == Ax2 && Ax1 == Ax2 + Ax3) {
					System.out.println("0 tam giac vuong can");
					System.out.printf("co canh huyen la: %s \nhai canh goc vuong bang nhau la: %s va %s", canhA, canhC,
							canhB);
				} else if (Ax1 == Ax3 && Ax2 == Ax3 + Ax1) {
					System.out.println("0 tam giac vuong can");
					System.out.printf("co canh huyen la: %s \nhai canh goc vuong bang nhau la: %s va %s", canhB, canhA,
							canhC);
				}
			} else {
				System.out.println("Day khong phai la hinh tam giac");
			}
		}
	}
}
