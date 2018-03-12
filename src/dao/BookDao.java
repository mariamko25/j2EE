package dao;

import javax.persistence.EntityManager;
import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of Book
 */
public class BookDao {
	
	EntityManager em;
	/**
	 * Constructor with no argument
	 * @param Em 
	 */
	public BookDao(EntityManager Em)
	{
		em=Em;
	}
	
	/**
	 * Create a new Book with no arguments
	 */
	public void Create(Book b)
	{
		
		em.persist(b);
		
	}
	
	
	/**
	 * return a Book
	 * @param id
	 * @return b
	 */
	public Book  Read(int id)
	{
		
		Book b=em.find(Book.class,id);		
		return 	b;
		
	}
	
	/**
	 * update the status of a book
	 * @param b
	 * @param isBorrowed
	 */
	public void Update(Book b,boolean isBorrowed)
	{
		em.find(Book.class,b.getID()).setBorrowed(isBorrowed);;
	}
	
	/**
	 * delete a Book
	 * @param b
	 */
	public void Delete(Book b)
	{
		
		em.remove(b);
		
	}

	/**
	 * close entityManager
	 */
	public void closeEm()
	{
		em.close();
	}
}
