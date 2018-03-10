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
	Author()
	{
		super();
	}
	
	/**
	 * Constructor to copy
	 * @param A
	 */
	Author(Author A)
	{
		super(A);
		nbBooks=A.getNbBooks();
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
