package tuan5_generic;

public class TestMatranSo_lab2_ctdl_hkI_2015 
{
	public static void main(String[] args)
	{
	    Integer[][] m1 = new Integer[][]{{1, 2}, {4, 5}};
	    Integer[][] m2 = new Integer[][]{{1, 1}, {2, 2}};

	    MaTranSo_lab2_ctdl_hkI_2015 matranSo = new MaTranSo_lab2_ctdl_hkI_2015();

	    System.out.println("\nm1 + m2 la: ");
	    MaTran_lab2_ctdl_hkI_2015.inRaKetQua(
	      m1, m2, matranSo.congHaiMaTran(m1, m2), '+');

	    System.out.println("\nm1 * m2 la: ");
	    MaTran_lab2_ctdl_hkI_2015.inRaKetQua(
	      m1, m2, matranSo.nhanHaiMaTran(m1, m2), '*');
	  }
}
