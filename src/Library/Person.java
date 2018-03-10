package Library;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 
 * @author MariamKonate
 * class implementing a person
 */
@MappedSuperclass
public class Person implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	

	/**
	 * constructor with no arguments
	 */
	Person()
	{
		
	}
	
	/**
	 * constructor to copy
	 * @param p
	 */
	Person(Person p)
	{
		Name=p.getName();
		Phone_Number=p.getPhone_Number();
		Email_Address=p.getEmail_Address();
		Age=p.getAge();
		
	}
	
	/**
	 * 
	 * @return ID
	 */
	public int getID() {
		return ID;
	}

	

	/**
	 * 
	 * @return Name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * 
	 * @return Phone_Number
	 */
	public String getPhone_Number() {
		return Phone_Number;
	}

	/**
	 * 
	 * @param phone_Number
	 */
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	/**
	 * 
	 * @return Email_Address
	 */
	public String getEmail_Address() {
		return Email_Address;
	}

	/**
	 * 
	 * @param email_Address
	 */
	public void setEmail_Address(String email_Address) {
		Email_Address = email_Address;
	}

	/**
	 * 
	 * @return Age
	 */
	public String getAge() {
		return Age;
	}

	/**
	 * 
	 * @param age
	 */
	public void setAge(String age) {
		Age = age;
	}

}
