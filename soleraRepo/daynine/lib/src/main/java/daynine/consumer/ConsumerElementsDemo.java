package daynine.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerElementsDemo {

	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6);
		ConsumerElements<Integer> consumer =(x)->System.out.println(x);
		
		System.out.println("************Higher Order function is -- displayInfo*******************");
		displayInfo(listOfInteger,consumer);
	}

	// Custom higher order function
		public static <T> void displayInfo(List<T> list, ConsumerElements<T> consumer) {
			for (T t : list) {
				consumer.acceptElement(t);
			}
		}

}
