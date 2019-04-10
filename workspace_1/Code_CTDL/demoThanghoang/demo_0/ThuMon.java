package demo_0;


import java.util.Random;


public class ThuMon extends CauThu{
    static final double TY_LE_SUT = 20.0;

    public ThuMon(int soAo, String ten) {
        super(soAo, ten);
    }

    public ThuMon() {
        super();
    }

    @Override
    public boolean sutBong() {
        Random random = new Random();
        double a = random.nextDouble() * TY_LE_SUT_BONG;
        if(a <= TY_LE_SUT) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Ten: %s \t So ao: %d \t Ty le sut: %.2f", getTen(), getSoAo(), TY_LE_SUT);
    }
}
