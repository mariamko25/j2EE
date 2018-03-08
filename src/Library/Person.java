package Library;

import javax.persistence.*;


@Entity(name="Person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PERSONTYPE", discriminatorType=DiscriminatorType.STRING,length=20)
@DiscriminatorValue("PERSON")
public class Person 
{
	
	@Id
	@Column(name="PersonID")
	int ID;
	
	@Column(name="Name")
	String Name;
	
	@Column(name="Phone_Number")
	String Phone_Number;
	
	@Column(name="Email_Address")
	String Email_Address;
	
	@Column(name="Age")
	String Age;
	
	
}
