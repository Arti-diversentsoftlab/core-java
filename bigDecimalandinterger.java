import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalandInteger {
public static void main(String[] args) {
    BigInteger f = new BigInteger("1"); // Or BigInteger ONE
    BigDecimal a = new BigDecimal("0.03");//for decimal
    BigDecimal b = new BigDecimal("0.04");

    int n=20;
    for (int i = 2; i <= n; i++){//factorial of n 
        f = f.multiply(BigInteger.valueOf(i));
    }
    System.out.println(f);//this f will contain huge int value 
    BigDecimal c = b.subtract(a);
    System.out.println(c);//it will contain decimal

}

}

