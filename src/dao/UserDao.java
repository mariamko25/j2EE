package dao;

import javax.persistence.EntityManager;
import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of User
 */
public class UserDao {
	
	
	EntityManager em;
	/**
	 * Constructor with no argument
	 * @param em 
	 */
	public UserDao(EntityManager Em)
	{
		em=Em;
	}
	
	/**
	 * Create a new User with no arguments
	 */
	void Create()
	{
		
		User a=new User();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
	}
	
	/**
	 * Create a new User with two arguments
	 * @param Fname
	 * @param Lname
	 */
	public void Create(String Fname, String Lname)
	{
		
		User a=new User(Fname,Lname);
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
	}
	
	/**
	 * return a user
	 * @param id
	 * @return b
	 */
	User Read(int id)
	{
		
		em.getTransaction().begin();
		User b=em.find(User.class,id);
		em.getTransaction().commit();
		return 	b;
	}
	
	/**
	 * update the number of books of an author
	 * @param u
	 * @param nbBook
	 */
	void Update(User u, int nbBorrowedBooks)
	{
		em.getTransaction().begin();
		em.find(User.class,u.getID()).setNbBorrowedBooks(nbBorrowedBooks);
		em.getTransaction().commit();
	}
	
	/**
	 * delete a user 
	 * @param a
	 */
	void Delete(User u)
	{
		em.getTransaction().begin();
		em.remove(u);
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
