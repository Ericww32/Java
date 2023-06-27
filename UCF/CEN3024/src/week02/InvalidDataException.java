package week02;

/**
 * Application exception
 * @author Scott
 *
 */
public class InvalidDataException extends Exception
{
	/**
	 * For serialization
	 */
	private static final long serialVersionUID = -7094835315596432869L;

	public InvalidDataException()
	{
	}

	public InvalidDataException(String message)
	{
		super(message);
	}

	public InvalidDataException(Throwable cause)
	{
		super(cause);
	}

	public InvalidDataException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public InvalidDataException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
