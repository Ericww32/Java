
public class Main {
	public static void main(String[] args) {
		Football terry = new Football("Terry", 26, "Steelers", "Saftey", "Defense");
		Football payton = new Football("payton", 30, "Broncos", "Quarterback", "offense");
		Golf tiger = new Golf("Tiger", 31, "Nike", null, "Eric Willoughby");
		Golf phil = new Golf("Phil", 31, "Nike", null, "Eric Willoughby");
		Baseball hank = new Baseball("Hank", 28, "Pirates", "Pitcher", "Second String");
		Baseball barry = new Baseball("Barry", 28, "Cubs", "First Base", "First String");
		Hockey mario = new Hockey("Mario", 34, "Penguins", "Foward", "Skater");
		Hockey wayne = new Hockey("Wanye", 32, "Penguins", "Goalie", "Goalie");
		
		terry.equals(payton);
		tiger.equals(phil);
		hank.equals(barry);
		mario.equals(wayne);
		
		terry.doThis();
		tiger.doThis();
		hank.doThis();
		mario.doThis();
		
		System.out.println(terry.toString());
		System.out.println(tiger.toString());
		System.out.println(hank.toString());
		System.out.println(mario.toString());
		
	}//end main

}
