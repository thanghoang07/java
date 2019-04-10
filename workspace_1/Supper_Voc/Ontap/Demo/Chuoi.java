package Demo;

public class Chuoi {
	public static void inTuTrongChuoi(String chuoi) {
		String[] mangStr = chuoi.split(" ");
		for (int i = 0; i < mangStr.length; i++) {
			System.out.print(mangStr[i] + "  ");
		}
	}

	public static void daoChuoi(String chuoi) {
		char[] mangCha = chuoi.toCharArray();
		for (int i = 0; i < mangCha.length / 2; i++) {
			char dau = mangCha[i];
			mangCha[i] = mangCha[mangCha.length - i - 1];
			mangCha[mangCha.length - i - 1] = dau;
		}
		for (int i = 0; i < mangCha.length; i++) {
			System.out.print(mangCha[i]);
		}
	}

	public static String daoChuoiDeQuy(String chuoi, int n) {
		if (n == 1)
			return chuoi.charAt(n - 1) + " ";
		else {
			return chuoi.charAt(n - 1) + daoChuoiDeQuy(chuoi, n - 1);
		}
	}
}
