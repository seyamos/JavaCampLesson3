package cofeeCustomerManagement;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(new Customer(1,"Þeyda","Erbay",new Date(1976,1,1), "22222222222"));
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(new Customer(1,"Þeyda","Erbay",new Date(1976,1,1), "22222222222"));
		
		//BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		//customerManager.save(new Customer(1,"Þeyda","Erbay",new Date(1980,1,1), "222222222222"));
	}

}
