
public class MainClass {

	public static void main(String[] args) {
		BASEBALL hank = new BASEBALL("Hank", 30, 440000.50, "giants", "ss");
		FOOTBALL terry = new FOOTBALL("terry", 44, 33000, "that team", "tackler guy");
		HOCKEY mario = new HOCKEY("mario", 39, 200000, "bears", "stick guy");
		GOLF tiger = new GOLF("tiger", 50, 400000, "my own team", "golfer");
		BASEBALL barry = new BASEBALL("barry", 25, 50000, "those guys", "ss");
		FOOTBALL payton = new FOOTBALL("payton", 40, 345660, "jets", "that one guy");
		HOCKEY wayne = new HOCKEY("wayne", 30, 77770, "titans", "another stick guy");
		GOLF phil = new GOLF("phil", 60, 200, "goler team", "idk");
		SOCCER carlos = new SOCCER("carlos", 17, 0, "high school team", "kicker");
		
		hank.doThis();
		System.out.println(hank);
		System.out.println("*****************");
		terry.doThis();
		System.out.println(terry);
		System.out.println("*****************");
		mario.doThis();
		System.out.println(mario);
		System.out.println("*****************");
		tiger.doThis();
		System.out.println(tiger);
		System.out.println("*****************");
		barry.doThis();
		System.out.println(barry);
		System.out.println("*****************");
		payton.doThis();
		System.out.println(payton);
		System.out.println("*****************");
		wayne.doThis();
		System.out.println(wayne);
		System.out.println("*****************");
		phil.doThis();
		System.out.println(phil);
		System.out.println("*****************");
		carlos.doThis();
		System.out.println(carlos);
		System.out.println("*****************");
		
	}//end of main
}//end of class
