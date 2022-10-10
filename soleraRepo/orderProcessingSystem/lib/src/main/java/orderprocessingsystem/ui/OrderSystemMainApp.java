package orderprocessingsystem.ui;



import orderprocessingsystem.models.Customer;
import orderprocessingsystem.models.Orders;
import orderprocessingsystem.models.Products;
import orderprocessingsystem.services.ServiceProduct;
import orderprocessingsystem.services.ServiceCustomer;
import orderprocessingsystem.services.ServiceHelperCustomer;
import orderprocessingsystem.services.ServiceHelperOrder;
import orderprocessingsystem.services.ServiceHelperProduct;
import orderprocessingsystem.services.ServiceOrder;

public class OrderSystemMainApp {
	public static void main(String[] args) {
//		##################### Adding Product #####################
		ServiceProduct serviceProduct = new ServiceHelperProduct();
		Products pro = new Products();
		pro.setProductId(105);
		pro.setProductname("HP");
		pro.setProductdesc("Laptop");
		pro.setQuantity(40);
		pro.setCustomerid(204);
//		System.out.println(serviceProduct.addProducts(pro));
//		##################### Adding Product #####################
		
//		##################### Adding Customer Details #####################
		ServiceCustomer serviceCustomer = new ServiceHelperCustomer();
		Customer customer = new Customer();
		customer.setCustomerId(204);
		customer.setCustomerName("Sam");
		customer.setGender("M");
		customer.setOrder_amount(8750);
//		System.out.println(serviceCustomer.addCustomerDetail(customer));
//		##################### Adding Customer Details #####################
		
//		##################### Adding Order Details #####################
		ServiceOrder serviceOrder = new ServiceHelperOrder();
		Orders orders = new Orders();
		
		if(customer.getCustomerId()==pro.getCustomerid()) {
			orders.setOrderId(1);
			orders.setQuantity(10);
			orders.setOrder_amount(70500);
			orders.setCustomerid(5);
			orders.setProductid(102);
			System.out.println(serviceOrder.addProducts(orders));
		}else {
			System.out.println("Id did not matched");
		}
//		
//		##################### Adding Orders Details #####################
	}

}
