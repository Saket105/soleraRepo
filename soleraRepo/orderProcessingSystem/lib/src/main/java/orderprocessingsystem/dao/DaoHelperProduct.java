package orderprocessingsystem.dao;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import orderprocessingsystem.models.Products;
import orderprocessingsystem.utilities.DatabaseController;


public class DaoHelperProduct implements DataControllerProduct{

	@Override
	public Products addProducts(Products product) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement statement = DatabaseController.getDBConnection()
					.prepareStatement("INSERT INTO product(productid,productname,productdesc,quantity,customerid) VALUES(?,?,?,?,?)");
			statement.setInt(1, product.getProductId());
			statement.setString(2, product.getProductname());
			statement.setString(3, product.getProductdesc());
			statement.setInt(4, product.getQuantity());
			statement.setInt(5, product.getCustomerid());
			
			int row = statement.executeUpdate();
			if(row>0) {
				return product;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return null;
	}

}
