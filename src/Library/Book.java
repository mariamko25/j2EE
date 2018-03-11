package Library;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 
 * @author MariamKonate
 * Class to represent a Book
 */
@Entity(name="Book")
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BookID", updatable = false, nullable = false)
	int ID;
	
	@ManyToOne
	Author Author;
	
	@Column(name="Title")
	String Title;
	
	@Column(name="Private")
	boolean Private;
	
	@Column(name="Borrowed")
	boolean Borrowed;
	
	@Column(name="Year")
	int Year;
	
	@Column(name="PageNumber")
	int PageNumber;
	
	@Column(name="BookGenres")
	BookGenres BookGenres;

	/**
	 * Constructor with no arguments
	 */

	public Book()
	{
		
	}
	
	/**
	 * Constructor to copy
	 * @param B
	 */

	public Book(Book B)
	{
		Author=B.getAuthor();
		Title=B.getTitle();
		Private=B.isPrivate();
		Borrowed=B.isBorrowed();
		Year=B.getYear();
		PageNumber=B.getPageNumber();
		BookGenres=B.getBookGenres();
	}
	
	/**
	 * Constructor with two arguments
	 * @param A
	 * @param T
	 */
	public Book(Author A, String T)
	{
		Author=new Author(A);
		Title=T;
	}
	
	/**
	 * 
	 * @return ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * 
	 * @return Author
	 */
	public Author getAuthor() {
		return Author;
	}

	/**
	 * 
	 * @param author
	 */
	public void setAuthor(Author author) {
		Author = author;
	}

	/**
	 * 
	 * @return Title
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * 
	 * @return Private
	 */
	public boolean isPrivate() {
		return Private;
	}

	/**
	 * 
	 * @param private1
	 */
	public void setPrivate(boolean private1) {
		Private = private1;
	}

	/**
	 * 
	 * @return Borrowed
	 */
	public boolean isBorrowed() {
		return Borrowed;
	}

	/**
	 * 
	 * @param borrowed
	 */
	public void setBorrowed(boolean borrowed) {
		Borrowed = borrowed;
	}

	/**
	 * 
	 * @return Year
	 */
	public int getYear() {
		return Year;
	}

	/**
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		Year = year;
	}

	/**
	 * 
	 * @return PageNumber
	 */
	public int getPageNumber() {
		return PageNumber;
	}

	/**
	 * 
	 * @param pageNumber
	 */
	public void setPageNumber(int pageNumber) {
		PageNumber = pageNumber;
	}

	/**
	 * 
	 * @return BookGenres
	 */
	public BookGenres getBookGenres() {
		return BookGenres;
	}

	/**
	 * 
	 * @param bookGenres
	 */
	public void setBookGenres(BookGenres bookGenres) {
		BookGenres = bookGenres;
	}

	
}
