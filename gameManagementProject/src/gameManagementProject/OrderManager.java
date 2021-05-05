package gameManagementProject;


public class OrderManager implements OrderService{

	@Override
	public void sell(Player player, Game game) {
		System.out.println(player.getName() + " isimli oyuncu " + game.gameName + " oyununu satýn aldý.");
		
	}

	@Override
	public void campaignApply(Player player, Campaign campaign) {		
			System.out.println(player.getName() + " oyuncusu için, " + campaign.getCampaignName() + " kampanyasý uygulandý");
            
        		
	}

}
