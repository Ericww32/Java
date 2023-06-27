import java.util.Random;

public class Part2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num;
		
		do{
			num = rand.nextInt(100);
			System.out.println("number: " + num);
			asserter(num);
		}while(num != 0);
	}
	
	private static void asserter(int x){
		
		assert(x > 0) : " you hit zero \n"; 		
	}
}
