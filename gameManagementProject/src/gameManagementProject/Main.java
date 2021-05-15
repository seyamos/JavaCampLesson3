package gameManagementProject;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		PlayerManager playerManager = new PlayerManager(new EDevletValidationAdapter());
		playerManager.add(new Player(1, "Şeyda", "Erbay", "22222222222", new Date(1980,1,1), "seyda@seyda.com",
			"12345"));
		
		OrderManager orderManager = new OrderManager();
		orderManager.sell(new Player(1, "Şeyda", "Erbay", "123456789", new Date(1980,1,1), "seyda@seyda.com",
			"12345"),
				new Game(1, "Red Cat",  "10$"));
		
		orderManager.campaignApply(new Player(1, "Ahmet", "Can", "123456789", new Date(2005,1,1), "ahmet@ahmet.com",
				"12345"),
				new Campaign(1,"Öğrencilik Güzeldir"));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1,"Gençler Buraya"));		
				
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"Black Cat", "15$"));
		
		
		
		

	}

}
