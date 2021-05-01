package gun3Odev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getEmail());
	}
	
	public void remove(User user) {
		System.out.println("Kullanýcý silindi: " + user.getEmail());
	}	
	
	
	

}
