package week02;

/**
 * Application exception
 * @author Scott
 *
 */
public class InvalidStateException extends Exception
{
	/**
	 * For serialization
	 */
	private static final long serialVersionUID = -1399110648203989509L;

	public InvalidStateException()
	{
	}

	public InvalidStateException(String arg0)
	{
		super(arg0);
	}

	public InvalidStateException(Throwable arg0)
	{
		super(arg0);
	}

	public InvalidStateException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}

	public InvalidStateException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3)
	{
		super(arg0, arg1, arg2, arg3);
	}

}
