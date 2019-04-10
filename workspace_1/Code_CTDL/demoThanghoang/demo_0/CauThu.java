package demo_0;


public abstract class CauThu {
    private int soAo;
    private String ten;
    static final double TY_LE_SUT_BONG = 100.0;

    public CauThu(int soAo, String ten) {
        this.soAo = soAo;
        this.ten = ten;
    }

    public CauThu() {
        this(-1, null);
    }

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public abstract boolean sutBong();
}
