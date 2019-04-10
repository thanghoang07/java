package video_Rental;

public abstract class LoaiPhimThue {
	public static final LoaiPhimThue CHILDRENS = new ChildrensPrice();
	public static final LoaiPhimThue REGULAR = new RegularPrice();
	public static final LoaiPhimThue NEW_RELEASE = new NewReleasePrice();

	public abstract double tinhTien(int ngayThue);

	// tính điểm thưởng cho người thuê thường xuyên
	public int tinhDiemThuong(int ngayThue) {
		return 1;
	}
}
