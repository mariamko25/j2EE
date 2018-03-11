package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of User
 */
public class UserDao {
	
	/**
	 * Constructor with no argument
	 */
	UserDao()
	{
		
	}
	
	/**
	 * Create a new User with no arguments
	 */
	void Create()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		User a=new User();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * Create a new User with two arguments
	 * @param Fname
	 * @param Lname
	 */
	public void Create(String Fname, String Lname)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		User a=new User(Fname,Lname);
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * return a user
	 * @param id
	 * @return b
	 */
	User Read(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		User b=em.find(User.class,id);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
		return 	b;
	}
	
	/**
	 * update the number of books of an author
	 * @param u
	 * @param nbBook
	 */
	void Update(User u, int nbBorrowedBooks)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.find(User.class,u.getID()).setNbBorrowedBooks(nbBorrowedBooks);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * delete a user 
	 * @param a
	 */
	void Delete(User u)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}

}
