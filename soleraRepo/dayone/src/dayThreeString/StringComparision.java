package dayThreeString;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		String s = "Hello";
		String s1 = new String("Hello");
		System.out.println(s==str); // Compare reference not values
		System.out.println(s.equals(str)); // compares values of string of equality
		
		System.out.println(str.hashCode());
		System.out.println(s.hashCode());
	}

}
