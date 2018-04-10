package problem3;


public class CardDeckException extends Exception{
    
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	public CardDeckException() {
		super();
	}
	
	
	public CardDeckException(String msg) {
		super(msg);
	}

	public CardDeckException(Throwable e) {
		super(e);
	}

	public CardDeckException(String msg, Throwable e) {
		super(msg, e);
	}

}
