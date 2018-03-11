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
	
	@Column(name="FirstName")
	String FName;
	
	@Column(name="LastName")
	String LName;
	
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
		LName=p.getLName();
		FName=p.getFName();
		Phone_Number=p.getPhone_Number();
		Email_Address=p.getEmail_Address();
		Age=p.getAge();
		
	 }
	
	 Person(String Fname,String Lname)
	 {
		LName=Lname;
		FName=Fname;
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
	 * @return FName
	 */
	public String getFName() {
		return FName;
	}

	/**
	 * 
	 * @param fName
	 */
	public void setFName(String fName) {
		FName = fName;
	}

	/**
	 * 
	 * @return LName
	 */
	public String getLName() {
		return LName;
	}

	/**
	 * 
	 * @param lName
	 */
	public void setLName(String lName) {
		LName = lName;
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
