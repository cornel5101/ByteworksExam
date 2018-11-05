
import java.math.BigInteger;

public class Factorial {

   public static BigInteger factorial(int num) {
    BigInteger fact = BigInteger.valueOf(1);
    for (int i = 1; i <= num; i++)
        fact = fact.multiply(BigInteger.valueOf(i));
    return fact;
}

    public static void main(String[] args) {

        for (int i = 22; i <= 100; i++) {
            System.out.println("Factorial of " + i + " + is:" + factorial(i));
        }
    }

}