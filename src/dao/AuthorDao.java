package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of Author
 */
public class AuthorDao {
	
	/**
	 * Constructor with no argument
	 */
	AuthorDao()
	{
		
	}

	/**
	 * Create a new Author with no arguments
	 */
	public void Create()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		Author a=new Author();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * Create a new Author with two arguments
	 * @param Fname
	 * @param Lname
	 */
	public void Create(String Fname, String Lname)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		Author a=new Author(Fname,Lname);
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	
	/**
	 * return an author
	 * @param id
	 * @return b
	 */
	public Author Read(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		Author b=em.find(Author.class,id);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
		return 	b;
	}
	
	/**
	 * update the number of books of an author
	 * @param a
	 * @param nbBook
	 */
	void Update(Author a,int nbBook)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.find(Author.class,a.getID()).setNbBooks(nbBook);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * delete an author 
	 * @param a
	 */
	void Delete(Author a)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
}
