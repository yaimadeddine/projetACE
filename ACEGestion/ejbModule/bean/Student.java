package bean;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
public class Student extends User implements Serializable {
	
	private String firstName;
	private String lastName;
	private String telephone;
	@OneToMany
	private List<Filiere> filiere;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
   
}
