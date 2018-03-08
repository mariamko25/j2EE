package Library;

import java.util.*;

import javax.persistence.*;

@Entity(name="Catalog")
public class Catalog {
	
	@Id
	@Column(name="CatalogID")
	int CatalogID;
	
	@OneToMany
	Set<Book> Books;
	
	@Column(name="Description")
	String description;
	
	
	

}
