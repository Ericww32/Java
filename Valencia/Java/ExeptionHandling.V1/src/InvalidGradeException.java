@SuppressWarnings("serial")
public class InvalidGradeException {

	public InvalidGradeException(String message) {

	}

	@Override
	public String toString() {
		return "InvalidGradeException [getMessage()=" + getMessage() + ", getLocalizedMessage()="
				+ getLocalizedMessage() + ", getCause()=" + getCause() + "]";
	}
	

}
