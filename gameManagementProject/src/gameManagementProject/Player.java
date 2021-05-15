package gameManagementProject;

import java.util.Date;

public class Player {
	
	private int id;
	private String name;
	private String surname;
	private String natioanalityId;
	private Date dateOfBirth;
	private String email;
	private String password;
	
	
	public Player(int id, String name, String surname, String natioanalityId, Date dateOfBirth, String email,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.natioanalityId = natioanalityId;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNatioanalityId() {
		return natioanalityId;
	}
	public void setNatioanalityId(String natioanalityId) {
		this.natioanalityId = natioanalityId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}