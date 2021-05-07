package caffeeShop.concretes;

import caffeeShop.abstracts.BaseCustomerManager;
import caffeeShop.abstracts.CustomerCheckService;
import caffeeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else System.out.println("Not a valid person");
			

	}


}
