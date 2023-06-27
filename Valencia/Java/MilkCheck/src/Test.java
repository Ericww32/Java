import java.util.*;

public class Test {

	public static void main(String[] args) throws OutOfMilkException {
		drinkMilk();

	}

	public static void drinkMilk() throws OutOfMilkException {
		int time = 0;
		boolean flag = true;
		Random rand = new Random();
		int denominator = 0;
		int numerator = 1;
		@SuppressWarnings("unused")
		int equation = 0;

		while (flag) {

			try {
				denominator = rand.nextInt(1000);
				numerator = rand.nextInt(999) + 1;
				equation = numerator / denominator;
				System.out.print(time + " Gulp... \n");
				time++;
			} catch (ArithmeticException e) {
				throw new OutOfMilkException(time);
			}

		}
	}

}
