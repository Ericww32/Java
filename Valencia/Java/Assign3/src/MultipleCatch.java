import java.util.*;

public class MultipleCatch {

	public static void main(String[] args) {

		try {
			Random r = new Random();
			int[] array = { 10, 20 };
			int result = array[r.nextInt(array.length + 1)] / r.nextInt(2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} 
	}

}
