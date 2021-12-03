package ws.synopsis.training.rest.exception;

public class TrainingFieldException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TrainingFieldException() {
	}
	public TrainingFieldException(String message) {
		super(message);
	}
	public TrainingFieldException(String message, Throwable cause) {
		super(message, cause);
	}
	public TrainingFieldException(Throwable cause) {
		super(cause);
	}

}
