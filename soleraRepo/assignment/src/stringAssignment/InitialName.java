package stringAssignment;

public class InitialName {
	public static void main(String[] args) {
		String name = "Saket Kumar";
		String s[] = name.split(" ");
		
		
		for(String ss:s) {
			System.out.print(ss.substring(0,1));
		}
		
		
	}
}
