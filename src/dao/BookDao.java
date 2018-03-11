package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of Book
 */
public class BookDao {
	
	/**
	 * Constructor with no argument
	 */
	BookDao()
	{
		
	}
	
	/**
	 * Create a new Book with no arguments
	 */
	void Create()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		Book b=new Book();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * Create a new Author with two arguments
	 */
	void Create(Author A,String T)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		Book b=new Book(A,T);
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * return a Book
	 * @param id
	 * @return b
	 */
	Book  Read(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		Book b=em.find(Book.class,id);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
		return 	b;
		
	}
	
	/**
	 * update the status of a book
	 * @param b
	 * @param isBorrowed
	 */
	void Update(Book b,boolean isBorrowed)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.find(Book.class,b.getID()).setBorrowed(isBorrowed);;
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * delete a Book
	 * @param b
	 */
	void Delete(Book b)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.remove(b);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}

}
