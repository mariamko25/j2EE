package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of CatalogDao
 */
public class CatalogDao {
	
	/**
	 * Constructor with no argument
	 */
	CatalogDao()
	{
		
	}
	
	/**
	 * Create a new Catalog with no arguments
	 */
	void Create()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		Catalog b=new Catalog();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * Create a new Catalog with one argument
	 * @param d
	 */
	void Create(String d)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		Catalog c=new Catalog(d);
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * return a catalog
	 * @param id
	 * @return c
	 */
	Catalog Read(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		Catalog c=em.find(Catalog.class,id);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
		return 	c;
	}
	
	/**
	 * update the booklist of a catalog
	 * @param b
	 * @param c
	 */
	void Update(Catalog c,Book b)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.find(Catalog.class,c.getCatalogID()).getBooks().add(b);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}
	
	/**
	 * delete a catalog
	 * @param c
	 */
	void Delete(Catalog c)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();	
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		em.close();
		entityManagerFactory.close();
	}

}
