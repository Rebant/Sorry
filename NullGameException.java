
public class NullGameException extends Exception {

	/**
	 * IDK
	 */
	private static final long serialVersionUID = 1L;
	
	String error;
	
	/**
	 * A new NullGameException with the error that a certain line is wrong.
	 * @param onLine Which line in the game file is wrong.
	 * Precondition: Can only use this through the parser.
	 */
	public NullGameException(int onLine) {
		this("Not a valid game file - line " + (onLine + 1) + " is not in the correct format.");
	}
	
	public NullGameException(String error) {
		super(error);
		this.error = error;
	}
	
	public String getError() {
		return error;
	}
	

}
