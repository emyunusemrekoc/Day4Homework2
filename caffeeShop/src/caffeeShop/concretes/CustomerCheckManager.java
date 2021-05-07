package caffeeShop.concretes;

import caffeeShop.abstracts.CustomerCheckService;
import caffeeShop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;

	}

}
