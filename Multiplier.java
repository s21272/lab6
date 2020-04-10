import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    public int multiple(int a, int b) {
        return a*b;
    }

    public int multiple(int a, int b, int c, int d) {
        return a*b*c*d;
    }

    public double multiple(double a, double b) {
        return a*b;
    }

    public int multiple(List<Integer> a) {
        int t = 1;
        for(int i = 0; i < a.size(); i++) {
            t = t* a.get(i);
        }
        return t;
    }
    public BigDecimal mutiple(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}

