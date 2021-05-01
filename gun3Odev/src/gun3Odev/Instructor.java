package gun3Odev;

public class Instructor extends User {
	
	private String name;
	private String surname;
	private String about;
	private String photo;
	public Instructor(int id, String email, String password, String name, String surname, String about, String photo) {
		super(id, email, password);
		this.name = name;
		this.surname = surname;
		this.about = about;
		this.photo = photo;
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
