package interfaceLibrary;
/** Reference Book class*/
public class ReferenceBook extends LibraryBook {
	/** collection name */
	private String collection;

	/**
	 * constructor function for ReferenceBook
	 * @param author
	 * @param title
	 * @param isbn
	 * @param callNumber
	 * @param collection
	 */
	public ReferenceBook (String author, String title, String isbn, String callNumber, String collection) {
		super(author, title, isbn, callNumber);
		this.collection = collection;
	}

	/**
	 * @return collection name
	 */
	public String getCollection() {
		return collection;
	}

	/**
	 * ReferenceBook collection field set function
	 * @param collection
	 */
	public void setCollection (String collection) {
		this.collection = collection;
	}

	/**
	 * inherited checkout method does not apply to reference books, prints error message
	 */
	public void checkout(String patron, String dueDate) {
		System.out.println("Cannot check out a reference book");
	}

	/**
	 * inherited returned method does not apply to reference books, prints error message
	 * */
	public void returned() {
		System.out.println("Reference book could not have been checked out -- return impossible.");
	}

	/**
	 * inherited circulationStatus method returns the status of the reference book
	 */
	public String circulationStatus() {
		return "Non-circulating reference book.";

	/** toString method for ReferenceBook returns all book information, nicely formatted */
	}
	public String toString() {
		return super.toString() + "\nCollection: " + collection;
	}
}
