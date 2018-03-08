package Library;

import javax.persistence.*;

@Entity(name="Author")
@DiscriminatorValue("AUTHOR")
public class Author extends Person{
	
	@Column(name="nbBooks")
	int nbBooks;


}
