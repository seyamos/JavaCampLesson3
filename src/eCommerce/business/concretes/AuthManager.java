package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.Utils;
import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService{
	private UserService userService;	

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userValidate(user)
				&& passwordValidate(user.getPassword())
				&& !userExists(user.getEmail())==false
				&& Utils.emailValidate(user.getEmail()))
		{
				userService.add(user);
		}else {
			System.out.println("Kayıt başarısız!");			
		}
			
		
	}

	@Override
	public void verify(User user, String token) {
		if(user!=null && token.length()>15) {
			User existUser=userService.get(user.getEmail());
			existUser.setVerify(true);
			
			userService.update(existUser);
			System.out.println("Email doğrulandı.!");
		}
		else {
			System.out.println("Email doğrulanamadı.!");
		}
		
		
	}

	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);
		if(user == null) {
			return false;
		}
		else {
			System.out.println("Bu email zaten kullanılıyor!" + email);
			return true;
		}	
	
	}

	@Override
	public void login(LoginDto loginDto) {
		User user = userService.get(loginDto.getEmail());
		if(user != null && user.getPassword().equals(loginDto.getPassword())) {
			System.out.println("Giriş başarılı");			
		}else {
		System.out.println("Kullanıcı adı veya şifreniz yanlış!");
		}
		
	}
	
	// boş alan bırakılmamalı kontrolü:
	public boolean userValidate(User user) {
		if(user != null
				&& !user.getName().isEmpty()
				&& !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty()
				&& !user.getPassword().isEmpty())
		{
			return true;
		}
		
		System.out.println("Boş alan bırakılamaz. Tüm bilgilerinizi girin!");
		return false;	
		
	}
	
	public boolean passwordValidate(String password) {
		if(password.length() >= 6) {
			return true;			
		}
		
		System.out.println("Şifreniz en az 6 karakter olmalıdır.");
		return false;
		
	}
	

}
