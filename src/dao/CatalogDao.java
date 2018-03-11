package dao;

import javax.persistence.EntityManager;
import Library.*;

/**
 * 
 * @author MariamKonate
 * Dao class of CatalogDao
 */
public class CatalogDao {
	
	EntityManager em;
	/**
	 * Constructor with no argument
	 * @param em 
	 */
	public CatalogDao(EntityManager Em)
	{
		em=Em;
	}
	
	/**
	 * Create a new Catalog with no arguments
	 */
	void Create()
	{
		
		Catalog b=new Catalog();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		
	}
	
	/**
	 * Create a new Catalog with one argument
	 * @param d
	 */
	void Create(String d)
	{
		
		Catalog c=new Catalog(d);
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}
	
	/**
	 * return a catalog
	 * @param id
	 * @return c
	 */
	Catalog Read(int id)
	{
		
		em.getTransaction().begin();
		Catalog c=em.find(Catalog.class,id);
		em.getTransaction().commit();
		return 	c;
	}
	
	/**
	 * update the booklist of a catalog
	 * @param b
	 * @param c
	 */
	void Update(Catalog c,Book b)
	{
		em.getTransaction().begin();
		em.find(Catalog.class,c.getCatalogID()).getBooks().add(b);
		em.getTransaction().commit();
	}
	
	/**
	 * delete a catalog
	 * @param c
	 */
	void Delete(Catalog c)
	{
		em.getTransaction().begin();
		em.remove(c);
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
