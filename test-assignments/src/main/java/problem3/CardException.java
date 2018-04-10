package problem3;


public class CardException extends Exception{
    
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	public CardException() {
		super();
	}
	
	
	public CardException(String msg) {
		super(msg);
	}

	public CardException(Throwable e) {
		super(e);
	}

	public CardException(String msg, Throwable e) {
		super(msg, e);
	}

}
