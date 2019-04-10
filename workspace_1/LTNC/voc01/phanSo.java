
public class phanSo 
{
    private int tuSo;   // the numerator
    private int mauSo;   // the denominator

    // khoi tao gia tri phan so
    public phanSo(int numerator, int denominator)
    {
        int g = gcd(numerator, denominator);
        tuSo = numerator   / g;
        mauSo = denominator / g;
    }
    // return string representation of (this)
    public String toString() { 
        if (mauSo == 1) 
        	return tuSo + "";
        else          
        	return tuSo + "/" + mauSo;
    }
    // return a * b
    public phanSo nhanPhanSo(phanSo b)
    {
        phanSo a = this;
        return new phanSo(a.tuSo * b.tuSo, a.mauSo * b.mauSo);
    }
    // return a + b
    public phanSo congPhanSo(phanSo b)
    {
        phanSo a = this;
        int numerator   = (a.tuSo * b.mauSo) + (a.mauSo * b.tuSo);
        int denominator = a.mauSo * b.mauSo;
        return new phanSo(numerator, denominator);
    }
    // return 1 / a
    public phanSo reciprocal()
    { 
    	return new phanSo(mauSo, tuSo); 
    }
    // return a / b
    public phanSo divides(phanSo b) 
    {
        phanSo a = this;
        return a.nhanPhanSo(b.reciprocal());
    }
    // return gcd(m, n) tim UCLN
    private static int gcd(int m, int n) 
    {
        if ( n == 0) 
        	return m;
        else 
        	return gcd(n, m % n);
    }
    // return lcm(m, n)tim BCNN
    private static int lcm(int m, int n) 
    {
        return m * (n / gcd(m, n));
    }
    public static void main(String[] args)
    {
        phanSo x, y, z;
        // 1/2 + 1/3 = 5/6
        x = new phanSo(1, 1);
        y = new phanSo(1, 1);
        z = x.congPhanSo(y);
        System.out.println(z);
        // 8/9 + 1/9 = 1
        x = new phanSo(1, 1);
        y = new phanSo(1, 1);
        z = x.congPhanSo(y);
        System.out.println(z);
        //  4/17 * 7/3 = 28/51
        x = new phanSo(-4, 17);
        y = new phanSo(7,  3);
        z = x.nhanPhanSo(y);
        System.out.println(z);
        // 203/16957 * 9299/5887 = 17/899
        x = new phanSo( 3, 9);
        y = new phanSo( 1, 1);
        z = x.nhanPhanSo(y);
        System.out.println(z);
    }
}
