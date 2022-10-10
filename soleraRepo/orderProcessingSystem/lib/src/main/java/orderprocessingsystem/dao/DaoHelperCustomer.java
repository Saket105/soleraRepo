package orderprocessingsystem.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import orderprocessingsystem.models.Customer;
import orderprocessingsystem.utilities.DatabaseController;

public class DaoHelperCustomer implements DataControllerCustomer{

	@Override
	public Customer addCustomerDetail(Customer customer) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement statement = DatabaseController.getDBConnection()
					.prepareStatement("INSERT INTO customer(customerid,customername,gender,order_amount) VALUES(?,?,?,?)");
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(3, customer.getGender());
			statement.setInt(4, customer.getOrder_amount());
			
			int row = statement.executeUpdate();
			if(row>0) {
				return customer;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return null;
	}

}
