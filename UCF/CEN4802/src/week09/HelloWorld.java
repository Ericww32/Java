package week09;

/**
 * This class demonstrates a simple class with a public method
 * 
 * The TestHarness executes this class and verifies the implementation
 *
 * This example shows how to declare a class in Java,
 * how to declare a method in java (display).
 * Method declarations have four parts: visibility modifier, return type, name, optional parameters
 * @author Scott LaChance
 *
 */
public class HelloWorld
{
	/**
	 * Entry point
	 * @param args command ling arguments No argments are supported
	 */
	public static void main(String[] args)
	{
		new HelloWorld().display();
	}
	
	/**
	 * Returns the Hello World text
	 * Format: "Hello World from <Your first and last name>"
	 * Example:
	 * <code>Hello World from Scott LaChance</code>
	 * @return Hello World text
	 */
	public String display()
	{
		return "Hello World from Scott LaChance";
	}
}
