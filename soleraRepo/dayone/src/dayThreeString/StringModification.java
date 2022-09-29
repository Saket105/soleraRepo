package dayThreeString;

public class StringModification {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);
		
		sb.insert(2, "Hello");
		System.out.println("sb = "+sb);
		sb.replace(8, 11, "hi");
		System.out.println("sb = "+sb);
		sb.delete(0, 2);
		System.out.println("sb = "+sb);
		sb.reverse();
		System.out.println("sb = "+sb);
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("have lunch time hi");
		System.out.println(sb1.capacity());
		
		
	}
}
