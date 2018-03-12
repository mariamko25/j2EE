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
	public void Create(Catalog c)
	{
		
		
		em.persist(c);
		
	}
	
	
	/**
	 * return a catalog
	 * @param id
	 * @return c
	 */
	public Catalog Read(int id)
	{
		
		Catalog c=em.find(Catalog.class,id);
		return 	c;
	}
	
	/**
	 * update the booklist of a catalog
	 * @param b
	 * @param c
	 */
	public void Update(Catalog c,Book b)
	{
		em.find(Catalog.class,c.getCatalogID()).getBooks().add(b);
	}
	
	/**
	 * delete a catalog
	 * @param c
	 */
	public void Delete(Catalog c)
	{
		em.remove(c);
	}
	/**
	 * close entityManager
	 */
	public void closeEm()
	{
		em.close();
	}
}
