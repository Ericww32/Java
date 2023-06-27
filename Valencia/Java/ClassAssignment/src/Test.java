import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {//easiest one to remember
			System.out.println("Exception thrown  :" + e);
		}

		try {
			Object obj = Integer.valueOf(1);
			String stringy = (String) obj;
		} catch (ClassCastException e) {
			System.out.println("Class Cast Exception");
		}

		try {
			System.out.printf("%o");
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Arguement Exception");
		}

		try {
			Object test = null;
			test = 10;
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}

		try {
			String word = "Doc Brown";
			int test = Integer.parseInt(word);
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception");
		}

		try {
			FileReader filereader = new FileReader("MyFile");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}

		try {
			throw new AssertionError();
		} catch (AssertionError e) {
			System.out.println("Assertion Error");
		}

		try {
			recursivePrint(2);
		} catch (StackOverflowError e) {
			System.out.println("Stack Over Flow Exception");
		}

		List<User> users = new ArrayList<User>(2);

		for (int i = 0; i < 2; i++) {
			try {
				users.add(new User(String.valueOf(i)));
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	public static void recursivePrint(int num) {
		System.out.print("Number: " + num + "\n");
		if (num == 0)
			return;
		else
			recursivePrint(++num);
	}

}

class User {
	private static String USER_ID = getUserId();

	public User(String id) {
		this.USER_ID = id;
	}

	private static String getUserId() {
		throw new RuntimeException("UserId Not found");
	}
}