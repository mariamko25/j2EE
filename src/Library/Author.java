package Library;

import javax.persistence.*;

@Entity(name="Author")
public class Author extends Person{
	
	@Column(name="nbBooks")
	int nbBooks;


}
