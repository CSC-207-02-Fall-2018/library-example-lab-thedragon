package interfaceLibrary;

public class CirculatingBook extends LibraryBook {
	String currentHolder;
	String dueDate;

	public CirculatingBook (String author, String title, String isbn, String callNumber) {
		super(author, title, isbn, callNumber);
		currentHolder = null;
		dueDate = null;
	}
	public String getCurrentHolder() {
		return currentHolder;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setCurrentHolder(String name) {
		currentHolder = name;
	}
	public void setDueDate(String date) {
		dueDate = date;
	}
	public void checkout(String patron, String dueDate) {
		this.currentHolder = patron;
		this.dueDate = dueDate;
	}
	
	public void returned() {
		currentHolder = null;
		dueDate = null;
	}
	public String circulationStatus () {
		if(currentHolder != null) {
			return "\nCurrent Holder: " + currentHolder
					+ "\nDue Date: " + dueDate;
		}
		else return "Book available on shelves.";
	}
	
	public String toString() {
		return super.toString() + "\n" + circulationStatus();
	}
}
