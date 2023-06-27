package week11;

/**
 * @author Scott LaChance
 * @version 1.0
 * @created 13-Mar-2016 9:12:01 PM
 */
public class FileProcessingException extends Exception
{
	/** version ID */
	private static final long serialVersionUID = 132919453665197522L;

	/**
	 * Finalizer
	 */
	public void finalize() throws Throwable
	{
		super.finalize();
	}

	/**
	 * Default
	 */
	public FileProcessingException()
	{

	}

	/**
	 * Parameterized constructor
	 * @param message Exception message
	 */
	public FileProcessingException(String message)
	{

	}

	/**
	 * Parameterized constructor
	 * @param message Exception message
	 * @param cause Original error
	 */
	public FileProcessingException(String message, Throwable cause)
	{

	}
}// end NotImplementedException