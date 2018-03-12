package dao;

import javax.persistence.EntityManager;
import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of Author
 */
public class AuthorDao {
	
	
	EntityManager em;
	/**
	 * Constructor with no argument
	 */
	public AuthorDao(EntityManager Em)
	{
		em=Em;
	}

	/**
	 * Create a new Author with no arguments
	 */
	public void Create(Author a)
	{
		
		em.persist(a);
	}
	
	
	
	/**
	 * return an author
	 * @param id
	 * @return b
	 */
	public Author Read(int id)
	{
		
		Author b=em.find(Author.class,id);
		
		return 	b;
	}
	
	/**
	 * update the number of books of an author
	 * @param a
	 * @param nbBook
	 */
	public void Update(Author a,int nbBook)
	{
		
		em.find(Author.class,a.getID()).setNbBooks(nbBook);
		
	}
	
	/**
	 * delete an author 
	 * @param a
	 */
	public void Delete(Author a)
	{
		
		em.remove(a);
		
	}
	
	/**
	 * close entityManager
	 */
	public void closeEm()
	{
		em.close();
	}
	
}
