package lab2_generic;

public abstract class Bai4<A extends Number> 
{
	  protected abstract A congLai(A o1, A o2);
	  protected abstract A nhanVao(A o1, A o2);
	  protected abstract A zero();

	  //cong ma tran
	  public A[][] congHaiMaTran(A[][] matran1, A[][] matran2)
	  {	    
	    if ((matran1.length != matran2.length) ||
	        (matran1[0].length != matran2[0].length));

	    A[][] ketQua1 =
	      (A[][])new Number[matran1.length][matran1[0].length];

	    for (int i = 0; i < ketQua1.length; i++)
	      for (int j = 0; j < ketQua1[i].length; j++)
	        ketQua1[i][j] = congLai(matran1[i][j], matran2[i][j]);
	    return ketQua1;
	  }

	  //nhan ma tran
	  public A[][] nhanHaiMaTran(A[][] matran1, A[][] matran2)
	  {	   
	    if (matran1[0].length != matran2.length);

	    A[][] ketQua2 =
	      (A[][])new Number[matran1.length][matran2[0].length];

	    for (int i = 0; i < ketQua2.length; i++)
	    {
	      for (int j = 0; j < ketQua2[0].length; j++)
	      {
	        ketQua2[i][j] = zero();
	        for (int k = 0; k < matran1[0].length; k++)
	        {
	          ketQua2[i][j] = congLai(ketQua2[i][j],
	            nhanVao(matran1[i][k], matran2[k][j]));
	        }
	      }
	    }
	    return ketQua2;
	  }

	  public static void inRaKetQua(
	      Number[][] matran1, Number[][] matran2, Number[][] matran3, char op)
	  {
	    for (int i = 0; i < matran1.length; i++)
	    {
	      for (int j = 0; j < matran1[0].length; j++)
	        System.out.print(" " + matran1[i][j]);
	      if (i == matran1.length / 2)
	        System.out.print("  " + op + "  ");
	      else
	        System.out.print("     ");
	      for (int j = 0; j < matran2.length; j++)
	        System.out.print(" " + matran2[i][j]);
	      if (i == matran1.length / 2)
	        System.out.print("  =  ");
	      else
	        System.out.print("     ");
	      for (int j = 0; j < matran3.length; j++)
	        System.out.print(matran3[i][j] + " ");
	      System.out.println();
	    }
	  }
	}

