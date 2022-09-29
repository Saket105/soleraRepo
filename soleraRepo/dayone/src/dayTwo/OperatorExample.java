package dayTwo;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne = 10;
		int numberTwo = 3;
		int result;
		result = numberOne+numberTwo;
		System.out.println("Addition = "+result);
		
		result = numberOne*numberTwo;
		System.out.println("Multiplication = "+result);
		
		result = numberOne/numberTwo;
		System.out.println("Division = "+result);
		
		result = numberOne-numberTwo;
		System.out.println("Subtraction = "+result);
		
		result = numberOne%numberTwo;
		System.out.println("Modulus = "+result);
		
		System.out.println("******************************");
		numberOne+=numberTwo;
		System.out.println("Addition = "+numberOne);
		
		numberOne-=numberTwo;
		System.out.println("Subtraction = "+numberOne);
		
		numberOne*=numberTwo;
		System.out.println("Multiplication = "+numberOne);
		
		numberOne/=numberTwo;
		System.out.println("Division = "+numberOne);
		
		numberOne%=numberTwo;
		System.out.println("Modulus = "+numberOne);
	}

}
