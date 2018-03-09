package Library;

import javax.persistence.*;

@Entity(name="User")
public class User extends Person{
	
	@Column(name="Login")
	String Login;
	
	@Column(name="Password")
	String Password;
	
	@Column(name="nbBorrowedBooks")
	int nbBorrowedBooks;

}
