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
	public void Create(User u)
	{
		
		em.persist(u);
		
	}
	
	
	/**
	 * return a user
	 * @param id
	 * @return b
	 */
	public User Read(int id)
	{
		
		User b=em.find(User.class,id);
		return 	b;
	}
	
	/**
	 * update the number of books of an author
	 * @param u
	 * @param nbBook
	 */
	public void Update(User u, int nbBorrowedBooks)
	{
		em.find(User.class,u.getID()).setNbBorrowedBooks(nbBorrowedBooks);
	}
	
	/**
	 * delete a user 
	 * @param a
	 */
	public void Delete(User u)
	{
		em.remove(u);
	}
	/**
	 * close entityManager
	 */
	public void closeEm()
	{
		em.close();
	}
}
