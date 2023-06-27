import java.util.*;

public class objectsAndClasses

{
	public static void main(String[] args) {
		AlarmClock time = new AlarmClock(1,1,1);
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("give me the time:\n");
		System.out.println("hours: ");
		int cHours = scanf.nextInt();
		time.setHours(cHours);
		time.getHours();
		
		System.out.println("\nminutes: ");
		int cMin = scanf.nextInt();
		time.setMin(cMin);
		time.getMin();
		
		System.out.println("\nseconds: ");
		int cSec = scanf.nextInt();
		time.setSec(cSec);
		time.getSec();
		
		System.out.println(time.hours + ":" + time.min + ":" + time.sec);

		
	}
	}

