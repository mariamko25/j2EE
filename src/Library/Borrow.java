package Library;

import javax.persistence.*;

@Entity(name="Borrow")
public class Borrow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BorrowingID", updatable = false, nullable = false)
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
