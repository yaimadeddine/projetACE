package bean;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Role
 *
 */
@Entity
public class Role implements Serializable {

	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<User> user;
	private static final long serialVersionUID = 1L;

	public Role() {
		super();
	}   

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
   
}
