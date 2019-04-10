package video_Rental;

public class RegularPrice extends LoaiPhimThue {

	@Override
	public double tinhTien(int ngayThue) {
		double tien = 3000;
		if (ngayThue > 2) {
			tien += (ngayThue - 2) * 1000;
		}
		return tien;
	}

}
