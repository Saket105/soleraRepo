package orderprocessingsystem.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import orderprocessingsystem.models.Orders;
import orderprocessingsystem.utilities.DatabaseController;

public class DaoHelperOrder implements DataControllerOrder{

	@Override
	public Orders addOrders(Orders orders) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement statement = DatabaseController.getDBConnection()
					.prepareStatement("INSERT INTO order_master(orderid,customerid, productid,quantity,order_amount) VALUES(?,?,?,?,?)");
			statement.setInt(1, orders.getOrderId());
			statement.setInt(2, orders.getCustomerid());
			statement.setInt(3, orders.getProductid());
			statement.setInt(4, orders.getQuantity());
			statement.setDouble(5, orders.getOrder_amount());
			int row = statement.executeUpdate();
			if(row>0) {
				return orders;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
