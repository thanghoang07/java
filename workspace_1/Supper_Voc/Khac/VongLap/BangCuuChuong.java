package VongLap;

public class BangCuuChuong {
	public static void main(String[] args) {
		System.out.println("Bang cuu chuong: \n");
		for (int i = 0; i <= 50; i++) {
			//System.out.println("Bang nhan " + i);
			for (int j = 0; j <= 100; j++) {
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}

}
