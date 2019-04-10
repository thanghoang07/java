package video_Rental;

public class NewReleasePrice extends LoaiPhimThue {

	@Override
	public double tinhTien(int ngayThue) {
		return ngayThue * 4000;
	}

	@Override
	public int tinhDiemThuong(int ngayThue) {
		if (ngayThue > 1) {
			return 2;
		} else
			return 1;
	}

}
