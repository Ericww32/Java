import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<Building> list = new ArrayList<>();

		Room[] room = new Room[4];
		room[0] = new Room(10, 20, "Granite", 2);
		room[1] = new Room(100, 60, "Carpet", 1);
		room[2] = new Room(70, 70, "Granite", 0);
		room[3] = new Room(10, 10, "Marble", 2);

		Room[] room2 = new Room[3];
		room2[0] = new Room(20, 25, "Tile", 1);
		room2[1] = new Room(10, 10, "Wood", 1);
		room2[2] = new Room(15, 15, "Carpet", 1);

		Room[] room3 = new Room[2];
		room3[0] = new Room(60, 50, "Marble", 0);
		room3[1] = new Room(75, 50, "Granite", 2);

		House house = new House(room, 1, 20, 3, 1001);
		House house2 = new House(room2, 2, 40, 2, 1002);
		House house3 = new House(room3, 1, 1, 1, 1003);

		Garage garage = new Garage(10, 12, 2, 2, "Carpet");
		Garage garage2 = new Garage(14, 20, 1, 1, "Wood");
		Garage garage3 = new Garage(6, 12, 6, 10, "Marble");

		list.add(house);
		list.add(house2);
		list.add(house3);
		list.add(garage);
		list.add(garage2);
		list.add(garage3);

		for (Building i : list) {
			System.out.println(i + "\n");
		}
		mlslistable(house);
		mlslistable(house2);
	}

	public static void mlslistable(MLSListable house) {
		System.out.println("for sale:");
		System.out.println(house.getMLSListing() + "\n");
	}
}
