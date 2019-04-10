package tuan5_generic;

public class MatranPhanSo_lab2_ctdl_hkI_2015 extends MaTran_lab2_ctdl_hkI_2015<PhanSo_lab2_ctdl_hkI_2015> 
{
	  @Override 
	  protected PhanSo_lab2_ctdl_hkI_2015 congLai(PhanSo_lab2_ctdl_hkI_2015 r1, PhanSo_lab2_ctdl_hkI_2015 r2)
	  {	   
		return r1.congHaiPhanSo(r2);
	  }
	  @Override 
	  protected PhanSo_lab2_ctdl_hkI_2015 nhanVao(PhanSo_lab2_ctdl_hkI_2015 r1, PhanSo_lab2_ctdl_hkI_2015 r2) 
	  {
	    return r1.nhanHaiPhanSo(r2);
	  }
	  @Override 
	  protected PhanSo_lab2_ctdl_hkI_2015 zero()
	  {
	    return new PhanSo_lab2_ctdl_hkI_2015(0,1);
	  }
	}
