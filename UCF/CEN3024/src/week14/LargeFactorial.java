package week14;

import java.math.BigInteger;

public class LargeFactorial {

	static BigInteger factorial(long num) {
		int c;
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");

		for (c = 1; c <= num; c++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		return fact;
	}

}
