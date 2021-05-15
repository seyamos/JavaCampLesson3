package eCommerce;


import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.AmazonMailManagerAdapter;
import eCommerce.core.GoogleMailManagerAdapter;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		//UserManager userManager=new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
		//userManager.getAll();
		
		System.out.println("------------");		
		User ece = new User(4, "Ece", "Güneþ", "ece@gmail.com", "123654", true);
		//userManager.add(ece);
		//userManager.getAll();
		
		System.out.println("-----------");	
		User ahmet = new User(2, "Ahmet", "Yýldýzlý, güncellendi", "ahmet@gmail.com", "147258", false);
		//userManager.update(ahmet);
		//userManager.getAll();
		
		System.out.println("-----------");
		//userManager.delete(3);
		//userManager.getAll();
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
		AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();
		
		AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));
		authManager.register(ece);
		
		
		UserManager userManager = new UserManager(inMemoryUserDao, amazonMailManagerAdapter);
		userManager.getAll();
		

	}

}
