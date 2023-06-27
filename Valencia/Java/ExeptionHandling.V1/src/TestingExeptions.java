import java.io.*;
import java.util.*;

public class TestingExeptions {

	public static void main(String[] args) {

		Random rand = new Random();
		int grades[] = new int[10];

		for (int i = 0; i <= grades.length; i++) {
			grades[i] = rand.nextInt(100) + 1;
		}

		try {
			average(grades);

		} catch (InvalidGradeException e) {
			System.out.println(e.toString());
		}

	}

	public static void average(int[] grades) throws InvalidGradeException {

		int sum = 0;
		int avg = sum / grades.length;

		System.out.println("Grades:\n");

		for (int i : grades) {
			if (grades[i] < 0) {
				throw new InvalidGradeException("ERROR at element " + i + "\nValue too low at: " + grades[i]);
			}
			if (grades[i] > 100) {
				throw new InvalidGradeException("ERROR at element " + i + "\nValue too high at: " + grades[i]);
			}

			sum += grades[i];
			System.out.println(i);

		}
		System.out.println("Average: " + avg);

		for (int i = 0; i <= grades.length; i++) {
			if (grades[i] <= 60) {
				grades[i] = 60;
			}
		}

		System.out.println("Final Grades:\n");

		for (int i : grades) {
			System.out.println(i);
		}

	}

}
