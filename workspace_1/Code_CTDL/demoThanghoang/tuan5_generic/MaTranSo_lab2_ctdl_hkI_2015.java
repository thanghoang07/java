package tuan5_generic;

public class MaTranSo_lab2_ctdl_hkI_2015 extends MaTran_lab2_ctdl_hkI_2015<Integer>
{
	  @Override /** Add two integers */
	  protected Integer congLai(Integer o1, Integer o2)
	  {
	    return o1 + o2;
	  }

	  @Override /** Multiply two integers */
	  protected Integer nhanVao(Integer o1, Integer o2)
	  {
	    return o1 * o2;
	  }

	  @Override /** Specify zero for an integer */
	  protected Integer zero()
	  {
	    return 0;
	  }
	}
