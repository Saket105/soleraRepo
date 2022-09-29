package dayThreeString;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c = {'H','e','l','l','o'};
		String str = new String(c);
		String s = "Hello";
//		System.out.println(str);
		
		if("hello" instanceof String) {
			System.out.println(true);
		}
		s="Hi";
		System.out.println(s);

	}

}
