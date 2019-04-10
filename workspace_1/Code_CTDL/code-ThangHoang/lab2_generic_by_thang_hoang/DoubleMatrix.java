package lab2_generic_by_thang_hoang;

public class DoubleMatrix extends Bai2_1<Double>
{
	@Override
	protected Double congLai(Double o1, Double o2)
	{
		return o1 + o2;
	}

	@Override
	protected Double nhanVao(Double o1, Double o2)
	{
		return o1 * o2;
	}

	@Override
	protected Double zero()
	{
		return (double) 0;
	}
}
