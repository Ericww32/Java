package week02;

import test.TestEngine;

/**
 * File: TestHarness.java
 */
public class TestHarness
{
	/**
	 * Main entry point for test
	 * @param args Command line arguments
	 */
    public static void main(String[] args)
    {
    	trace("Starting test...");

		trace(" -- setup test data");
    	TestEngine engine = new TestEngine();
    	engine.addTest(new TestSequenceIdentifier());

    	engine.runTests();

    	trace("Completed test");
    }

	static private void trace(String msg)
	{
		System.out.println(msg);
	}
}