import java.util.*;

public class Test {

	public static void main(String[] args) {
		ArrayList<Building> list = new ArrayList<>();
		
		House house = new House(null, null, null);
		House house2 = new House(null, null, null);
		Garage garage = new Garage(null, null);
		Garage garage2 = new Garage(null, null);
		Room room = new Room(12, 14, "tile", 10);
		
		System.out.println(house.toString() + "\n");
		System.out.println(garage.toString() + "\n");
		System.out.println(room.toString() + "\n");
		
		
		list.add(house);
		list.add(house2);
		list.add(garage);
		list.add(garage2);
		
		for(Building i : list){
		System.out.println(i);
		}
	}
	
	public static void mlslistable(MLSListable house) {
		System.out.println("Sell");
		//System.out.println(house.getMLSListing() + "\n");
		}
	
}
