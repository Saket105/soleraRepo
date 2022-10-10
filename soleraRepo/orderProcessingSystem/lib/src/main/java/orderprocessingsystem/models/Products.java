package orderprocessingsystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Products {
	int productId;
	String productname;
	String productdesc;
	int quantity;
	int customerid;
}
