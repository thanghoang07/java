package tuan13;

public class EmptySetException extends RuntimeException {
	public EmptySetException() {
		super("The set is empty.");
	}

	// Creates the exception with the specified message.
	public EmptySetException(String message) {
		super(message);
	}

}
