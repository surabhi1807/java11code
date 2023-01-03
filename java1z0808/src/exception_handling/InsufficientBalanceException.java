package exception_handling;

public class InsufficientBalanceException extends Exception {
	private String message;
	
public  InsufficientBalanceException(String message) {
	this.message = message;
}
public String getMessage() {
	return message;
}
}
