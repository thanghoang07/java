package lab2;

public class MonthDay {

	public int thang = 5, nam = 2012;

	public static void main(String[] args) {

		MonthDay date = new MonthDay();

		if (date.thang > 12 || date.thang < 1) {
			System.out.println("Bạn đã nhập sai tháng");
		} else if (date.nam < 0) {
			System.out.println("Bạn đã gán sai năm”");
		} else {

			switch (date.thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Tháng " + date.thang + " có 31 ngày");
				break;
			case 2:
				if (date.nam_nhuan()) {
					System.out.println("Tháng 2 có 29 ngày");
				} else {
					System.out.println("Tháng 2 có 28 ngày");
				}
				break;
			default:
				System.out.println("Tháng " + date.thang + " có 30 ngày");
			}
		}
	}

	public boolean nam_nhuan() {
		if (nam % 4 == 0) {
			if (nam % 100 != 0) {
				return true;
			} else if (nam % 400 == 0) {
				return true;
			}
		}
		return false;
	}
}