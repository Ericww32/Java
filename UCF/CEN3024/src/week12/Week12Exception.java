package week12;

public class Week12Exception extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1893714798006544957L;

	/** 
	 * Default Exception
	 */
	public Week12Exception()
	{
	}

	/**
	 * Parameterized constructor
	 * @param msg Message
	 */
	public Week12Exception(String msg)
	{
		super(msg);
	}

	/**
	 * Parameterized constructor
	 * @param ex Exception
	 */
	public Week12Exception(Throwable ex)
	{
		super(ex);
	}

	/**
	 * Parameterized constructor
	 * @param msg Message
	 * @param ex Exception
	 */
	public Week12Exception(String msg, Throwable ex)
	{
		super(msg, ex);
	}

	/**
	 * Parameterized constructor
	 * @param msg Message
	 * @param ex Exception
	 * @param enableSuppression true to enable suppression
	 * param writableStackTrace true for a writable stack trace
	 */
	public Week12Exception(String msg, Throwable ex, boolean enableSuppression,
			boolean writableStackTrace)
	{
		super(msg, ex, enableSuppression, writableStackTrace);
	}
}
