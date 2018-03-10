package Library;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

/**
 * 
 * @author MariamKonate
 * Class representing a Catalog
 */
@Entity(name="Catalog")
public class Catalog implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CatalogID", updatable = false, nullable = false)
	int CatalogID;
	
	@OneToMany
	Set<Book> Books;
	
	@Column(name="Description")
	String description;

	/**
	 * Constructor with no arguments
	 */
	Catalog()
	{
		
	}
	
	/**
	 * Constructor to copy
	 * @param C
	 */
	Catalog(Catalog C)
	{
		Books=C.getBooks();
		description= C.getDescription();
	}
	
	/**
	 * 
	 * @return CatalogID
	 */
	public int getCatalogID() {
		return CatalogID;
	}

	/**
	 * 
	 * @return Books
	 */
	public Set<Book> getBooks() {
		return Books;
	}

	/**
	 * 
	 * @param books
	 */
	public void setBooks(Set<Book> books) {
		Books = books;
	}

	/**
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
