package demo_0;


import java.util.Random;


public class TienDao extends CauThu{
    static final double TY_LE_SUT = 70.0;

    public TienDao(int soAo, String ten) {
        super(soAo, ten);
    }

    public TienDao() {
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
