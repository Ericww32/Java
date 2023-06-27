package week08;

import test.AbstractTestHarness;

/**
 * File: TestHarness.java
 */
class TestHarness extends AbstractTestHarness
{
	public static void main(String[] args)
	{
		new TestHarness().runTests();
	}

    
    /**
	 * Implements the base class abstract method
	 */
	protected void runTests()
	{
		try
		{			
			boolean boggleTest = executeTest(JUnitBoggleTest.class);
			boolean result = boggleTest;

			trace(result ? "Tests Passed" : "Tests Failed");
		}
		catch(Exception ex)
		{
			trace(ex.getMessage());
		}
	}
}