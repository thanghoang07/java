package video_Rental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	// in ra ten phim va trang thai cua phim
	public static void inPhim(List<Movie> phim) {
		System.out.println("Danh sach phim hien tai");
		System.out.println("---------------------------------");
		for (Movie movie : phim) {
			System.out.printf("* Ma so phim: %s \nTen Phim: %s", movie.getMa(), movie.getTenPhim());
			System.out.println("\nTrang thai: " + ((movie.isTrangThai()) ? ("Co san") : ("Khong co san")));
			System.out.println(".................................");
		}
		System.out.println("=================================");
	}

	// in ra trang thai cua phim
	public static void inTrangThaiPhim(List<Movie> phim) {
		for (Movie movie : phim) {
			System.out.println(movie.toString());
		}
	}

	// tim mot phim coi da duoc thue hay chua
	public static void inMotPhim(String maSo, List<Movie> phim) {
		for (Movie movie : phim) {
			if (movie.timPhim(maSo)) {
				System.out.println(movie.toString());
			}
		}
	}

	public static void main(String[] args) {
		// tao một danh sách các phim
		List<Movie> phim = new ArrayList<Movie>();
		// them phim vao List phim
		phim.add(new Movie("001", "Batman vs Superman: Dawn of Justice", "Warner Bros", LoaiPhimThue.NEW_RELEASE));
		phim.add(new Movie("002", "Captain America: Civil War", "Marvel Studios", LoaiPhimThue.NEW_RELEASE));
		phim.add(new Movie("003", "X-men: Apocalypse", "20th Century Fox", LoaiPhimThue.NEW_RELEASE));
		phim.add(new Movie("004", "Angry Birds 3D", "Sony Pictures Entertainment", LoaiPhimThue.CHILDRENS));
		phim.add(new Movie("005", "Finding Dory", "Pixar Animation Studios", LoaiPhimThue.CHILDRENS));
		phim.add(new Movie("006", "Kungfu Panda 3", " DreamWorks Animation", LoaiPhimThue.CHILDRENS));
		phim.add(new Movie("007", "Come Back, Mister", "SBS", LoaiPhimThue.REGULAR));
		phim.add(new Movie("008", "The Flash ss2", "CW", LoaiPhimThue.REGULAR));
		phim.add(new Movie("009", "The Flash ss1", "CW", LoaiPhimThue.REGULAR));
		phim.add(new Movie("010", "Assassination Classroom ss2", "DAX Production", LoaiPhimThue.REGULAR));
		//
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		inPhim(phim);
		//
		Customer cu1 = new Customer("Thang");
		Customer cu2 = new Customer("Toan");
		Customer cu3 = new Customer("Huy");
		//
		cu1.muonPhim(phim.get(0), new Date(01, 04, 2016));
		cu1.muonPhim(phim.get(3), new Date(01, 04, 2016));
		cu1.muonPhim(phim.get(6), new Date(01, 04, 2016));
		//
		cu2.muonPhim(phim.get(1), new Date(12, 04, 2016));
		cu2.muonPhim(phim.get(4), new Date(12, 04, 2016));
		cu2.muonPhim(phim.get(7), new Date(12, 04, 2016));
		//
		cu3.muonPhim(phim.get(2), new Date(10, 04, 2016));
		cu3.muonPhim(phim.get(5), new Date(10, 04, 2016));
		cu3.muonPhim(phim.get(8), new Date(01, 04, 2016));
		cu3.muonPhim(phim.get(9), new Date(10, 04, 2016));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		// kiểm tra coi một phim bât kỳ nào đó đã được thuê hay chưa??
		System.out.print("nhap vao ma phim can kiem: ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		inMotPhim(string, phim);
		// in trang thai cua phim
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("In ra tat ca phim");
		inTrangThaiPhim(phim);
		// in hoa đơn
		cu1.inHoaDon();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		cu2.inHoaDon();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		cu3.inHoaDon();
		// trả lại phim đã thuê
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		cu1.traLai("Come Back, Mister");
	}
}
