import java.math.*;
import java.util.*;

public class Multiplier {

    private int num1;
    private int num2;
    private int num3;
    private int num4;

    private double num5;
    private double num6;

    private BigDecimal x;
    private BigDecimal y;

    private ArrayList<Integer> integers = new ArrayList<Integer>();

    public int Multiply(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 * num2;
    }

    public int Multiply(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        int prod1 = num1 * num2;
        int prod2 = num3 * num4;
        int result = prod1 * prod2;
        return result;
    }

    public double Multiply(double num5, double num6) {
        this.num5 = num5;
        this.num6 = num6;
        return num5 * num6;
    }
    public int Multiply(ArrayList<Integer> integers) {
        this.integers = integers;
        int product = 1;
        for (int i = 0; i < integers.size(); i++) {
            product *= integers.get(i);
        }
        return product;
    }

    public BigDecimal Multiply(BigDecimal x, BigDecimal y) {
        this.x = x;
        this.y = y;
        return x.multiply(y);
    }

}
