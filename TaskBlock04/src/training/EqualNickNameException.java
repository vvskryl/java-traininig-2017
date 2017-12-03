package training;

public class EqualNickNameException extends Exception {
	String message;
	
	public EqualNickNameException (String message) {
		this.message = message;
	}
}
