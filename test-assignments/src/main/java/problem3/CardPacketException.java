package problem3;


public class CardPacketException extends Exception{
    
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	public CardPacketException() {
		super();
	}
	
	
	public CardPacketException(String msg) {
		super(msg);
	}

	public CardPacketException(Throwable e) {
		super(e);
	}

	public CardPacketException(String msg, Throwable e) {
		super(msg, e);
	}

}
