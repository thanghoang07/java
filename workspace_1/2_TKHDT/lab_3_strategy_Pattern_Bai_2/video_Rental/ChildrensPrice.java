package video_Rental;

public class ChildrensPrice extends LoaiPhimThue {

	public double tinhTien(int ngayThue) {
		double result = 2500;
		if (ngayThue > 3)
			result += (ngayThue - 3) * 1500;
		return result;
	}

}
