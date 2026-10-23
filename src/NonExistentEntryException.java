package excepcionesCatedra;

public class NonExistentEntryException extends RuntimeException{
	
	public NonExistentEntryException(String s) {
		super(s);
	}
}
