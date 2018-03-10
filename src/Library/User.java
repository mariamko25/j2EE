package Library;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author MariamKonate
 * Class representing a user
 */
@Entity(name="User")
public class User extends Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="Login")
	String Login;
	
	@Column(name="Password")
	String Password;
	
	@Column(name="nbBorrowedBooks")
	int nbBorrowedBooks;

	/**
	 * Constructor with no arguments
	 */
	User()
	{
		super();
	}
	
	/**
	 * 
	 * @param u
	 */
	User(User u)
	{
		super(u);
		Login=u.getLogin();
		Password= u.getPassword();
		nbBorrowedBooks=u.getNbBorrowedBooks();
	}
	
	/**
	 * 
	 * @return Login
	 */
	public String getLogin() {
		return Login;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		Login = login;
	}

	/**
	 * 
	 * @return Password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * 
	 * @return nbBorrowedBooks
	 */
	public int getNbBorrowedBooks() {
		return nbBorrowedBooks;
	}

	/**
	 * 
	 * @param nbBorrowedBooks
	 */
	public void setNbBorrowedBooks(int nbBorrowedBooks) {
		this.nbBorrowedBooks = nbBorrowedBooks;
	}
	
	
}
