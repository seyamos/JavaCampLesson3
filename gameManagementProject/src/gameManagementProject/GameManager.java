package gameManagementProject;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Yeni oyun sisteme eklendi: " + game.getGameName());
		
	}

}
