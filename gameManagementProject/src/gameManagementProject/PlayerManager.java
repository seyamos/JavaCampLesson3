package gameManagementProject;


public class PlayerManager implements PlayerService{	
	
	
	private UserValidationService userValidationService;
	

	public PlayerManager(UserValidationService userValidationService) {
		
		this.userValidationService = userValidationService;
		
		
	}

	@Override
	public void add(Player player) {
		if(userValidationService.Validate(player)) {			
			System.out.println("Oyuncu eklendi: " + player.getName()+" "+ player.getSurname());
		
		}else {
			System.out.println("Oyuncunun kimliði doðrulanamadý");
		}
		
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player removed: " + player.getName()+player.getSurname());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Player updated: " + player.getName()+player.getSurname());
		
	}

}
