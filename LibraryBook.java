package interfaceLibrary;

abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
	/** call number for the LibraryBook */
	protected String callNumber;

	/**
	 * constructor for LibraryBook
	 * @param newAuthor
	 * @param newTitle
	 * @param newIsbn
	 * @param newCallNumber
	 */
	public LibraryBook (String newAuthor, String newTitle, String newIsbn, String newCallNumber) {
		super(newAuthor, newTitle, newIsbn);
		callNumber = newCallNumber;
	}

	/**
	 * get method for LibraryBook callNumber field
	 * @return call number of the library book
	 */
	public String getCallNumber () {
		return callNumber;
	}

	/**
	 * set method for LibraryBook callNumber field
	 * @param newNumber the call number of the library book
	 */
	public void setCallNumber (String newNumber) {
		callNumber = newNumber;
	}

	abstract void checkout(String patron, String dueDate);
	abstract void returned();
	abstract String circulationStatus();

	/** 
	 * implementation of Comparable's compareTo method
	 * @param lib:  Library object being compared
	 * @return 0 if call numbers of this and lib match
	 *         < 0 if call number of this comes before call number of lib
	 *         > 0 otherwise
	 */
	public int compareTo (LibraryBook lib) {
		return (callNumber.compareTo(lib.callNumber));
	}
	
	/**
	 * @return title, author, ISBN, call number as a String for printing
	 */
	public String toString () {
		return (super.toString() + "\n Library call number: " + callNumber);
	}

}
