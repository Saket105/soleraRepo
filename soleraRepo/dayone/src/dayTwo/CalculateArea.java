package dayTwo;

public interface CalculateArea {
		public int area(int length, int breadth);

		public int perimeter(int length, int breadth);

		
		default void display1() {
		System.out.println("Hello");
	}
}
