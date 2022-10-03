package daynine.methodreference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String currency;
	private Double amount;

	public Order(Double amount) {
		this.amount = amount;
	}

	// Static Method
	public static void displayCurrency() {
		System.out.println("Static Method display currency");
	}

	// Normal Method or instance method
	public void displayAmount() {
		System.out.println(this.amount);
	}

}
