package interfaceLibrary;
/** book class*/
public class Book {
	/** author of the book*/
	protected String author;

	/** title of the book */
	protected String title;

	/** ISBN number for the book */
	protected String isbn;

	/** null constructor for Book */
	public Book () {
		author = "";
		title = "";
		isbn = "";
	}

	/** parameterized constructor for Book */
	public Book (String bookAuthor, String bookTitle, String bookIsbn) {
		author = bookAuthor;
		title = bookTitle;
		isbn = bookIsbn;
	}

	/** get method for Book author field
	 * @return book author's name
	 */
	public String getAuthor () {
		return author;
	}

	/** get method for Book title field
	 * @return book title
	 */
	public String getTitle () {
		return title;
	}

	/** get method for Book isbn field
	 * @return book isbn number
	 */
	public String getIsbn () {
		return isbn;
	}

	/**
	 * set method for Book author field
	 * @param newAuthor book author's name
	 */
	public void setAuthor (String newAuthor) {
		author = newAuthor;
	}

	/**
	 * set method for Book title field
	 * @param newTitle book title
	 */
	public void setTitle (String newTitle) {
		title = newTitle;
	}

	/**
	 * set method for Book isbn field
	 * @param newIsbn book's isbn value
	 */
	public void setIsbn (String newIsbn) {
		isbn = newIsbn;
	}

	/** Book's toString method
	 * @return nicely formatted string containing book's information
	 */
	public String toString () {
		return (" Book author: " + author + "\n Book title: " + title + "\n Book ISBN number: " + isbn);
	}


}
