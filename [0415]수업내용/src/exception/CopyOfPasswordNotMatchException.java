package exception;

public class CopyOfPasswordNotMatchException extends Exception {
	private static final long serialVersionUID = 1L;

	public CopyOfPasswordNotMatchException(){
		super("Password Not Match Exception");
	}
}
