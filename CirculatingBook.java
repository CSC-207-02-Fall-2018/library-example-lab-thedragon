package interfaceLibrary;
/** class for circulating book in library */
public class CirculatingBook extends LibraryBook {
	/** current holder of book */
	String currentHolder;

	/** due date of book (in string form) */
	String dueDate;

	/**
	 * constructor function for CirculatingBook
	 * @param author
	 * @param title
	 * @param isbn
	 * @param callNumber
	 */
	public CirculatingBook (String author, String title, String isbn, String callNumber) {
		super(author, title, isbn, callNumber);
		currentHolder = null;
		dueDate = null;
	}

	/**
	 * @return currentHolder field
	 */
	public String getCurrentHolder() {
		return currentHolder;
	}

	/**
	 * @return dueDate field
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * set method for currentHolder field
	 * @param name
	 */
	public void setCurrentHolder(String name) {
		currentHolder = name;
	}

	/**
	 * set method for dueDate field
	 * @param date
	 */
	public void setDueDate(String date) {
		dueDate = date;
	}

	/**
	 * inherited checkout method: sets currentHolder and dueDate
	 * @param patron
	 * @param dueDate
	 */
	public void checkout(String patron, String dueDate) {
		this.currentHolder = patron;
		this.dueDate = dueDate;
	}

	/**
	 * inherited returned method: resets currentHolder and dueDate fields to null values
	 */
	public void returned() {
		currentHolder = null;
		dueDate = null;
	}

	/**
	 * inherited circulationStatus method: returns info about book's current status
	 * @return String status
	 */
	public String circulationStatus () {
		if(currentHolder != null) {
			return "\nCurrent Holder: " + currentHolder
					+ "\nDue Date: " + dueDate;
		}
		else return "Book available on shelves.";
	}

	/**
	 * toString method for CirculatingBook: returns formatted information using circulationStatus method
	 */
	public String toString() {
		return super.toString() + "\n" + circulationStatus();
	}
}
