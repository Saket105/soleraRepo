package orderprocessingsystem.services;

import java.util.List;

import orderprocessingsystem.dao.DaoHelperOrder;
import orderprocessingsystem.dao.DataControllerOrder;
import orderprocessingsystem.models.Orders;

public class ServiceHelperOrder implements ServiceOrder{

	@Override
	public Orders addProducts(Orders order) {
		// TODO Auto-generated method stub
		DataControllerOrder dataorder = new DaoHelperOrder();
		Orders orders = dataorder.addOrders(order);
		
		return orders;
	}

}
