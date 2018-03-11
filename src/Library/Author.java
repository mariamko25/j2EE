package Library;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 
 * @author MariamKonate
 * Class representing an author
 */
@Entity(name="Author")
public class Author extends Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="nbBooks")
	int nbBooks;
	
	/**
	 * Constructor with no arguments
	 */

	public Author()
	{
		super();
	}
	
	/**
	 * Constructor to copy
	 * @param A
	 */

	public Author(Author A)
	{
		super(A);
		nbBooks=A.getNbBooks();
	}

	/**
	 * Constructor with two arguments
	 * @param Fname
	 * @param Lname
	 */
	public Author(String Fname,String Lname)
	{
		super(Fname,Lname);
	}
	
	/**
	 * 
	 * @return nBooks
	 */
	public int getNbBooks() {
		return nbBooks;
	}

	/**
	 * 
	 * @param nbBooks
	 */
	public void setNbBooks(int nbBooks) {
		this.nbBooks = nbBooks;
	}
	
}
