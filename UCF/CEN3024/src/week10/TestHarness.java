package week10;

import java.util.List;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This class executes the JUnit Test specified from the command line This will
 * be used by the reference system for testing your code.
 * 
 * @author Scott LaChance
 *
 */
public class TestHarness
{
	public static void main(String[] args)
	{
		trace("TestHarness");
		try
		{
			Result result = org.junit.runner.JUnitCore
					.runClasses(Week10JUnitTest.class);
			int runs = result.getRunCount();
			int ignores = result.getIgnoreCount();
			trace(String.format("Runs: %d", runs));
			trace(String.format("Ingores: %d", ignores));
			int failCount = result.getFailureCount();
			if(failCount > 0)
			{
				List<Failure> failures = result.getFailures();
				for(Failure fail : failures)
				{
					trace("FAILED: " + fail.getMessage());
				}
			}
			else
			{
				trace("SUCCESS");
			}
		}
		catch(Exception ex)
		{
			trace("Unhandled exception: " + ex.getMessage());
		}
	}

	private static void trace(String msg)
	{
		System.out.println(msg);
	}
}
