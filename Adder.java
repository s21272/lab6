import java.math.*;
import java.util.*;

public class Adder {

    private int num1;
    private int num2;

    private BigDecimal x;
    private BigDecimal y;

    public int add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 + num2;
    }

    public BigDecimal add(BigDecimal x, BigDecimal y) {
        this.x = x;
        this.y = y;
        return x.add(y);
    }

    public static BigDecimal add(ArrayList<BigDecimal> bigDecimals) {
        BigDecimal product = BigDecimal.valueOf(0);
        for (int i = 0; i < bigDecimals.size(); i++) {
            product = product.add(bigDecimals.get(i));
        }
        return product;
    }

}
