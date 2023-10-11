package lesson_wrappers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {

    public static void main(String[] args) {
        BigDecimal bigNumber = new BigDecimal("0." + "0".repeat(100) + "1");

        System.out.println(bigNumber);
    }
}
