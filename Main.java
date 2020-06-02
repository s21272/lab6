import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<BigDecimal> bigDecimals = new ArrayList<BigDecimal>();
        bigDecimals.add(BigDecimal.valueOf(578));
        bigDecimals.add(BigDecimal.valueOf(0.76576));
        bigDecimals.add(BigDecimal.valueOf(6.087));
        bigDecimals.add(BigDecimal.valueOf(0.987));

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(3);

        Multiplier twoValues = new Multiplier();
        Adder addTwoValues = new Adder();

        System.out.println(addTwoValues.add(12,24));
        System.out.println(twoValues.Multiply(33,45));
        Address  country = new Address();
        System.out.println(country.createAddress("United Kingdom"));
        Address  countryCity = new Address();
        System.out.println(countryCity.createAddress("Canada","Ottawa"));
        Address fullAddress = new Address();
        System.out.println(fullAddress.createAddress("The United States of America", "Washington DC", 20001,
                "4 George Washington Street", 1776));

    }
}
