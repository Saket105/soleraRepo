package orderprocessingsystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
	int orderId, quantity;
	double order_amount;
	int customerid, productid;
}
