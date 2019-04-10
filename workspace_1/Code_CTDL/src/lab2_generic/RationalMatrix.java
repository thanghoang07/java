package lab2_generic;

public class RationalMatrix extends Bai4<Rational> 
{
	  @Override 
	  protected Rational congLai(Rational r1, Rational r2)
	  {	   
		return r1.congHaiPhanSo(r2);
	  }
	  @Override 
	  protected Rational nhanVao(Rational r1, Rational r2) 
	  {
	    return r1.nhanHaiPhanSo(r2);
	  }
	  @Override 
	  protected Rational zero()
	  {
	    return new Rational(0,1);
	  }
	}
