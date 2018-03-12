package Library;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		AuthorDao A=new AuthorDao(em);
		CatalogDao C= new CatalogDao(em);
		UserDao U= new UserDao(em);
		BookDao B=new BookDao(em);

		
		Author a= new Author("author1","author1");
		Author b= new Author("author2","author2");

		Book book1=new Book();
		Book book2=new Book();
		
		Catalog c1=new Catalog("catalogue public");
		Catalog c2=new Catalog("catalogue prive");
		
		User u1= new User("user1","user1");
		User u2= new User("user2","user2");

		A.Create(a);
		A.Create(b);
		C.Create(c1);
		C.Create(c2);
		U.Create(u1);
		U.Create(u2);
		B.Create(book1);
	    B.Create(book2);
	    
		em.getTransaction().commit();
		em.close();
		//entityManagerFactory.close();
		
		
		
		
		
	}

}
