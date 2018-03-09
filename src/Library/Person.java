package Library;

import javax.persistence.*;


@Entity(name="Person")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Person 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PersonID", updatable = false, nullable = false)
	int ID;
	
	@Column(name="Name")
	String Name;
	
	@Column(name="Phone_Number")
	String Phone_Number;
	
	@Column(name="Email_Address")
	String Email_Address;
	
	@Column(name="Age")
	String Age;
	
	Person()
	{
		
	}
	
	
}
