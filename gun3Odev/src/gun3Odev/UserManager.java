package gun3Odev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getEmail());
	}
	
	public void remove(User user) {
		System.out.println("Kullan�c� silindi: " + user.getEmail());
	}	
	
	
	

}
