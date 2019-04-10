package VongLap;

public class Bai3 {
	public static void main(String[] args) {
		int cha = 35;
		int con = 4;
		while (cha != con * 2) {
			cha++;
			con++;
		}
		System.out.printf("Sau %d năm nữa tuổi cha sẽ gấp đôi tuổi con",
				(cha - 35));
	}
}
