package eCommerce.core;

import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService {
	
	private UserService userService;
	public GoogleAuthManagerAdapter(UserService userservice) {
		super();
		this.userService=userService;
	}
	

	@Override
	public void register(String email) {
		if(userExists(email) == false) {				
			userService.add(email);	
		}		
		else {
			User user=userService.get(email);			
			LoginDto loginDto=new LoginDto();
			loginDto.setEmail(user.getEmail());
			loginDto.setPassword(user.getPassword());
			
			login(loginDto);
		}	
		
	}

	@Override
	public boolean userExists(String email) {
		
		if(userService.get(email) != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public void login(LoginDto loginDto) {
		if(loginDto != null && loginDto.getPassword().equals(loginDto.getPassword())) {
			System.out.println("Giriþ baþarýlý.");				
		}
		else {
			System.out.println("Kullanýcý adý veya þifre yanlýþ!");
		}
		
	}

}
