package Library;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 
 * @author MariamKonate
 * Class to display borrowed books
 */
@Entity(name="Borrow")
public class Borrow implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BorrowingID", updatable = false, nullable = false)
	int Id;
	
	@ManyToOne
	Book book;
	
	@ManyToOne
	User user;
	
	@Column(name="Beginning")
	String From;
	
	@Column(name="End")
	String To;
	
	/**
	 * Constructor with no argument
	 */
	Borrow()
	{
		
	}
	
	/**
	 * Constructor to copy
	 * @param B
	 */
	Borrow(Borrow B)
	{
		book=B.getBook();
		user=B.getUser();
		From=B.getFrom();
		To=B.getTo();
	}
	
	/**
	 * 
	 * @return Id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * 
	 * @return book
	 */
	public Book getBook() {
		return book;
	}
	
	/**
	 * 
	 * @param book
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * 
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 * @return From
	 */
	public String getFrom() {
		return From;
	}

	/**
	 * 
	 * @param from
	 */
	public void setFrom(String from) {
		From = from;
	}

	/**
	 * 
	 * @return To
	 */
	public String getTo() {
		return To;
	}

	/**
	 * 
	 * @param to
	 */
	public void setTo(String to) {
		To = to;
	}

	

}
