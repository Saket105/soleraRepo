package orderprocessingsystem.services;

import java.util.List;



import orderprocessingsystem.dao.DaoHelperProduct;
import orderprocessingsystem.dao.DataControllerProduct;
import orderprocessingsystem.models.Products;

public class ServiceHelperProduct implements ServiceProduct{

	@Override
	public Products addProducts(Products product) {
		// TODO Auto-generated method stub
		DataControllerProduct dataController = new DaoHelperProduct();
		Products product1 = dataController.addProducts(product); 
		return product1;
	}

}
