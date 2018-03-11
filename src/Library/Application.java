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
		AuthorDao A=new AuthorDao(em);
		UserDao U= new UserDao(em);

		A.Create("author1","author1");
		A.Create("author2","author2");
		A.Create("author3", "author3");
		
		U.Create("user1", "user1");
		U.Create("user2", "user2");
		U.Create("user3", "user3");
		
		
		em.close();
		//BookDao B=new BookDao(em);
		
		//CatalogDao C=new CatalogDao(em);
		entityManagerFactory.close();
		
		
		
		
		
	}

}
