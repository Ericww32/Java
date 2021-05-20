import java.util.*;

public class Questions {

	public static void main(String[] args) {
		int[][] table1 = { { 3, 2, 5 }, { 1, 9, 6 }, { 7, 8, 4 } };  // this one
																	 // is true
		int[][] table2 = { { 3, 3, 5 }, { 1, 9, 6 }, { 3, 8, 4 } };  // this one
																	 // is false
		int[][] table3 = { { 3, 2, 5 }, { 1, 9, 6 }, { 3, 8, 4 } };  // this one
																	 // is false
		int[][] table4 = { { 3, 2, 1 }, { 10, 4, 6 }, { 5, 7, 8 } }; // this one
																	 // is false
		int[][] table5 = { { 4, 1, 5 }, { 1, 9, 6 }, { 7, 8, 4 } };  // this one
																	 // is false

		if (allNinePresent(table1)) {
			System.out.println("All 9 are there in table1");
		} else {
			System.out.println("All 9 are NOT there in table1");
		}
		if (allNinePresent(table2)) {
			System.out.println("All 9 are there in table2");
		} else {
			System.out.println("All 9 are NOT there in table2");
		}
		if (allNinePresent(table3)) {
			System.out.println("All 9 are there in table3");
		} else {
			System.out.println("All 9 are NOT there in table3");
		}
		if (allNinePresent(table4)) {
			System.out.println("All 9 are there in table4");
		} else {
			System.out.println("All 9 are NOT there in table4");
		}
		if (allNinePresent(table5)) {
			System.out.println("All 9 are there in table5");
		} else {
			System.out.println("All 9 are NOT there in table5");
		}
	}

	public static boolean allNinePresent(int[][] array) {
		for (int number = 1; number <= 9; number++) {

			for (int row = 0; row < array.length; row++) {

				for (int col = 0; col < array[row].length; col++) {
					if (!(array[row][col] == number)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
