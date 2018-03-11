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
	public void Create()
	{
		
		Author a=new Author();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
	}
	
	/**
	 * Create a new Author with two arguments
	 * @param Fname
	 * @param Lname
	 */
	public void Create(String Fname, String Lname)
	{
		
		Author a=new Author(Fname,Lname);
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
	}
	
	
	/**
	 * return an author
	 * @param id
	 * @return b
	 */
	public Author Read(int id)
	{
		
		em.getTransaction().begin();
		Author b=em.find(Author.class,id);
		em.getTransaction().commit();
		
		return 	b;
	}
	
	/**
	 * update the number of books of an author
	 * @param a
	 * @param nbBook
	 */
	void Update(Author a,int nbBook)
	{
		
		em.getTransaction().begin();
		em.find(Author.class,a.getID()).setNbBooks(nbBook);
		em.getTransaction().commit();
		
	}
	
	/**
	 * delete an author 
	 * @param a
	 */
	void Delete(Author a)
	{
		
		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();
		
	}
	
	/**
	 * close entityManager
	 */
	public void closeEm()
	{
		em.close();
	}
	
}
