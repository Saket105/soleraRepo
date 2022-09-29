package dayThreeString;

public class StringOperation {

	public static void main(String[] args) {
		// 
		String hello = "Hello";
		System.out.println("Length of hello string is = "+hello.length());
		System.out.println("Index of character 'e' in the hello string = "+hello.indexOf('e'));
		System.out.println("Substring from the hello = "+hello.substring(1));
		System.out.println("Substring from the hello = "+hello.substring(1,3));
		
		String hi = "Hi            ";
		System.out.println(hi);
		System.out.println("Remove space = "+hi.trim());
		int num = 12345;
		String numStr = String.valueOf(num);
		System.out.println(numStr instanceof String);
		Integer n = Integer.parseInt(numStr);
		System.out.println(n instanceof Integer);
		System.out.println(n*5);
		
		
		System.out.println(hello.hashCode());
		hello = hello.concat(" Everyone");
		System.out.println(hello);
		System.out.println(hello.hashCode());
		
		String leadingSpace = "    Morning     ";
		System.out.println(leadingSpace.trim());
		String strStrip = " Hello World !!   ";
		System.out.println(strStrip.strip());
		System.out.println(strStrip.stripLeading());
		System.out.println(strStrip.stripTrailing());
		System.out.println(strStrip.trim());
		
		strStrip=strStrip.replaceAll(" ", "");
		System.out.println(strStrip);
		
		//Api for paragraphs -- NO
		System.out.println("**************");
		String paragraph="Hello Everyone, today is very wonderful sunny day. We are learning String concepts. Here we are learning now about paragraph.";
		
		String[] splittedParagraph = paragraph.split("[.]");
		
		for(String sentence: splittedParagraph) {
			System.out.println(sentence);
		}
		
		
	}

}
