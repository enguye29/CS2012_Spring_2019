package lecture03_oop_iii.book_examples;

import java.math.BigInteger;

public class LargeFactorial {
  public static void main(String[] args) {
    System.out.println("50! is \n" + LargeFactorial.factorial(50));
  }

  public static BigInteger factorial(long n) {
    BigInteger result = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
		result = result.multiply(new BigInteger(i+""));
	}

    return result;
  }
}
