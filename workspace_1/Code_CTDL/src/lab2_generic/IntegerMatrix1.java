package lab2_generic;

public class IntegerMatrix1 extends Bai2<Integer>
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
