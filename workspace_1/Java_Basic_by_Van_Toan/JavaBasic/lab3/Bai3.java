package lab3;

public class Bai3 {
	public static void main(String[] args) {
		int tuoiCha = 35;
		int tuoiCon = 4;
		int count = 0;

		while (tuoiCon * 2 != tuoiCha) {
			tuoiCha++;
			tuoiCon++;
			count++;
		}
		System.out.println("Sau " + (/* tuoiCha - 35 */ count) + " nam tuoi cha la " + tuoiCon
				+ " luc do tuoi cha gap doi tuoi con");
	}
}
