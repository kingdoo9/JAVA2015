package exception;

public class UserIDNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserIDNotFoundException() {
		super("User ID Not Found Exception");
	}
}
