package khac;

public class SwitchDemo {

	public static void main(String[] args) {
		int a = 3;

		switch (a) {
		case 1:
			System.out.println("Chủ nhật");
			break;
		case 2:
			System.out.println("Thứ Hai");
			break;
		case 3:
			System.out.println("Thứ Ba");
			break;
		case 4:
			System.out.println("Thứ Tư");
			break;
		case 5:
			System.out.println("Thứ Năm");
			break;
		case 6:
			System.out.println("Thứ Sáu");
			break;
		case 7:
			System.out.println("Thứ Bảy");
			break;
		default:
			System.out.println("Bạn đã gán sai giá trị, chỉ được gán số nguyên từ 1 tới 7");
			break;
		}
	}
}
