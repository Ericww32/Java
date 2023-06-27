package week06;

import static org.junit.Assert.*;
import org.junit.Test;

public class Week06JUnitTest {

	public Week06JUnitTest() {

	}

	@Test
	public void testApplication() {
		TimedGcd gcd = new TimedGcd();
		int run = 1;

		Week06TestData[] m_testData = new Week06TestData[] { 
				new Week06TestData(4567820, 2147483640, 20, false),
				new Week06TestData(545690876L, 3456901294L, 2, false),
				new Week06TestData(546587619L, 21474836121L, 3, false),
				new Week06TestData(951987545L, 21474836651L, 1, false), 
				new Week06TestData(10, 5, 5, false),
				new Week06TestData(1542354865L, 3216548445L, 5, false), 
				new Week06TestData(-100, 325, 5, true),
				new Week06TestData(4951987545L, 3216548445L, 15, false),
				new Week06TestData(94951987542L, 33216548448L, 6, false) 
				};

		try {
			for (Week06TestData test : m_testData) {
				trace("Test Run " + run++ + "\n***********");

				try {
					gcd.start(test.getM(), test.getN());
					if(test.expectIllegalArgumentException()){
						String msg = String.format("Expected invalid argument exception\n%s", test.toString());
						fail(msg);
					}
					
					trace("M: " + test.getM() + ", N: " + test.getN());
					trace("Euclid time: " + gcd.getElapsedTime() + " ns \n");
					long euclid = gcd.getGcdValue();
					
					if (euclid != test.getExpected()) {
						String msg = String.format("Euclid: %d, Expected: %d", euclid, test.getExpected());
						trace(msg);
						fail(msg);
					}
				} catch (IllegalArgumentException e) {
					trace("M: " + test.getM() + ", N: " + test.getN());
					if(!test.expectIllegalArgumentException()){
						String msg = String.format("Got unexpected illegal argument exception \n%s\n%s", 
								e.getMessage(), test.toString());
						fail(msg);
					}else{
						trace("Caught illegal arguments!!!");
					}
				}
			}

		} catch (IllegalArgumentException e) {
			
		}

	}// end of testApp

	private void trace(String msg) {
		System.out.println(msg);
	}
}