
@SuppressWarnings("serial")
public class InvalidGradeException extends Exception{
	
	public InvalidGradeException(String message) {

	}

	@Override
	public String toString() {
		return "InvalidGradeException [getMessage()=" + getMessage() + ", getLocalizedMessage()="
				+ getLocalizedMessage() + ", getCause()=" + getCause() + "]";
	}
	

}
