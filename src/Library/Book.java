package Library;

import javax.persistence.*;

@Entity(name="Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BookID", updatable = false, nullable = false)
	int ID;
	
	@ManyToOne
	Author Author;
	
	@Column(name="Title")
	String Title;
	
	@Column(name="Private")
	boolean Private;
	
	@Column(name="Borrowed")
	boolean Borrowed;
	
	@Column(name="Year")
	int Year;
	
	@Column(name="PageNumber")
	int PageNumber;
	
	@Column(name="BookGenres")
	BookGenres BookGenres;
}
