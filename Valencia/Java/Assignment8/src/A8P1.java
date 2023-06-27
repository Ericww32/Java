import java.util.*;

public class A8P1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Bob");
		al.add("Zack");
		al.add("Issabel");
		al.add("Cody");
		al.add("Jon");
		al.add("Susan");
		al.add("Gabe");
		al.add("Eric");

		System.out.println("Sorted list:");
		Collections.sort(al);
		for (java.lang.String i : al) {
			System.out.println(i);
		}
		int location = findName(al, "Susan");
		System.out.println("\nLocation for Susan: " + ++location);
		System.out.println("-----------------------------------");
		
		System.out.println("\nShuffled list:");
		Collections.shuffle(al);
		for (java.lang.String i : al) {
			System.out.println(i);
		}
		int location2 = findName(al, "Susan");
		System.out.println("\nLocation for Susan: " + ++location2);
		System.out.println("-----------------------------------");
		
		String[] list = new String[al.size()];
		list = al.toArray(list);//ArrayList to Array
		
		for (String i : list) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");

		List<String> list1 = Arrays.asList(list);//Array to ArrayList
		System.out.println(list1);

	}

	public static int findName(ArrayList<String> arrayList, String target) {
		int result = -1;

		for (int i = 0; i <= arrayList.size(); i++) {
			if (arrayList.get(i) == target) {
				result = i;
				break;
			}
		}

		return result;
	}

}
