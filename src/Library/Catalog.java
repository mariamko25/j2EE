package Library;

import java.util.*;

import javax.persistence.*;

@Entity(name="Catalog")
public class Catalog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CatalogID", updatable = false, nullable = false)
	int CatalogID;
	
	@OneToMany
	Set<Book> Books;
	
	@Column(name="Description")
	String description;
	
	
	

}
