package week04;

/**
 * An invalid location has been applied
 * @author Scott LaChance
 *
 */
@SuppressWarnings("serial")
public class InvalidLocationException extends Exception
{
	/**
	 * Default Constructor
	 */
	public InvalidLocationException()
	{
	}

	/**
	 * Parameterized constructor
	 * @param msg Message for this exception
	 */
	public InvalidLocationException(String msg)
	{
		super(msg);
	}

	/**
	 * Parameterized constructor
	 * @param error The throwable error this is wrapping
	 */
	public InvalidLocationException(Throwable error)
	{
		super(error);
	}

	/**
	 * Parameterized constructor
	 * @param msg Message for this exception
	 * @param error The throwable error this is wrapping
	 */
	public InvalidLocationException(String msg, Throwable error)
	{
		super(msg, error);
	}
}
