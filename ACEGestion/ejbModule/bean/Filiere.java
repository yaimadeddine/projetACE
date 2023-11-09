package bean;

import java.io.Serializable;
import java.lang.String;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Entity implementation class for Entity: Filiere
 *
 */
@Entity

public class Filiere implements Serializable {

	   
	@Id
	private int id;
	private String code;
	private String name;
	private static final long serialVersionUID = 1L;

	public Filiere() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
