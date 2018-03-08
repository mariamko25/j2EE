package Library;

import javax.persistence.*;

@Entity(name="Borrow")
public class Borrow {
	
	@Id
	@Column(name="BorrowingID")
	int Id;
	
	@ManyToOne
	Book book;
	
	@ManyToOne
	User user;
	
	@Column(name="Beginning")
	String From;
	
	@Column(name="End")
	String To;
	

}
