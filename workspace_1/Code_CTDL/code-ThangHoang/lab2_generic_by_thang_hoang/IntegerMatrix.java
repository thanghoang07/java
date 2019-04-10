package lab2_generic_by_thang_hoang;

public class IntegerMatrix extends Bai4<Integer> 
{
	@Override
	protected Integer congLai(Integer o1, Integer o2)
	{
		return o1 + o2;
	}

	@Override
	protected Integer nhanVao(Integer o1, Integer o2)
	{
		return o1 * o2;
	}

	@Override
	protected Integer zero() 
	{
		return 0;
	}
}
