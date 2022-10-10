package orderprocessingsystem.services;

import java.util.List;

import orderprocessingsystem.dao.DaoHelperCustomer;
import orderprocessingsystem.dao.DataControllerCustomer;
import orderprocessingsystem.models.Customer;

public class ServiceHelperCustomer implements ServiceCustomer{

	@Override
	public Customer addCustomerDetail(Customer customer) {
		// TODO Auto-generated method stub
		DataControllerCustomer dataControllerCustomer = new DaoHelperCustomer();
		Customer customer1 = dataControllerCustomer.addCustomerDetail(customer);
		return customer1;
	}
}
