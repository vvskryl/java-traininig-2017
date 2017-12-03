package training;

public class EqualEmailException extends Exception {
	String message;
	
	public EqualEmailException (String message) {
		this.message = message;
	}
}
