package week07;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * Tests the week07 application
 * 
 * @author Scott LaChance
 *
 */
@SuppressWarnings("unused")
public class Week07JUnitTest
{
	@Test
	public void testApplication()
	{
		Week07Singleton singleton1 = Week07Singleton.getInstance();
		Week07Singleton singleton2 = Week07Singleton.getInstance();
		assertNotNull("Singleton should not be null", singleton1);
		assertNotNull("Singleton should not be null", singleton2);
		assertEquals(singleton1,singleton2);

	}

	private void trace(String msg)
	{
		System.out.println(msg);
	}
}
