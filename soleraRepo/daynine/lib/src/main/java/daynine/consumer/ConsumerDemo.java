package daynine.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> display = x -> System.out.println(x);
		display.accept("Consumer Functional Interface usage");

		// Higher Order Function
		// Below example will accepts Consumer as an argument,
		// simulates a forEach to
		// print each item from a list

		List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6);
		Consumer<Integer> consumer =(x)->System.out.println(x);
		System.out.println("************Higher Order function is -- displayInfo*******************");
		displayInfo(listOfInteger,consumer);
	}

	// Custom higher order function
		public static <T> void displayInfo(List<T> list, Consumer<T> consumer) {
			for (T t : list) {
				consumer.accept(t);
			}
		}
}
