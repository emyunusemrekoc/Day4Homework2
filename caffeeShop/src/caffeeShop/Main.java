package caffeeShop;

import java.time.LocalDate;

import caffeeShop.abstracts.BaseCustomerManager;
import caffeeShop.adapters.MernisServiceAdapter;
import caffeeShop.concretes.NeroCustomerManager;
import caffeeShop.concretes.StarbucksCustomerManager;
import caffeeShop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customerEngin = new Customer();
		customerEngin.setId(1);
		customerEngin.setFirstName("Engin");
		customerEngin.setLastName("Demiroð");
		customerEngin.setNationalityId("28861499108");
		customerEngin.setDateOfBirth(LocalDate.of(1985,1,5));
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customerEngin);
		
		
	}
}
