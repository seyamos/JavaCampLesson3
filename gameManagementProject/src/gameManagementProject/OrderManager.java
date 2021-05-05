package gameManagementProject;


public class OrderManager implements OrderService{

	@Override
	public void sell(Player player, Game game) {
		System.out.println(player.getName() + " isimli oyuncu " + game.gameName + " oyununu sat�n ald�.");
		
	}

	@Override
	public void campaignApply(Player player, Campaign campaign) {		
			System.out.println(player.getName() + " oyuncusu i�in, " + campaign.getCampaignName() + " kampanyas� uyguland�");
            
        		
	}

}
