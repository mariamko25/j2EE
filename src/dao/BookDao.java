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
	void Create()
	{
		
		Book b=new Book();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		
	}
	
	/**
	 * Create a new Author with two arguments
	 */
	void Create(Author A,String T)
	{
		
		Book b=new Book(A,T);
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		
	}
	
	/**
	 * return a Book
	 * @param id
	 * @return b
	 */
	Book  Read(int id)
	{
		
		em.getTransaction().begin();
		Book b=em.find(Book.class,id);
		em.getTransaction().commit();
		
		return 	b;
		
	}
	
	/**
	 * update the status of a book
	 * @param b
	 * @param isBorrowed
	 */
	void Update(Book b,boolean isBorrowed)
	{
		em.getTransaction().begin();
		em.find(Book.class,b.getID()).setBorrowed(isBorrowed);;
		em.getTransaction().commit();
	}
	
	/**
	 * delete a Book
	 * @param b
	 */
	void Delete(Book b)
	{
		
		em.getTransaction().begin();
		em.remove(b);
		em.getTransaction().commit();
		
	}

	/**
	 * close entityManager
	 */
	void closeEm()
	{
		em.close();
	}
}
