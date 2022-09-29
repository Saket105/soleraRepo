package assignment;

public class CalculatorHelper implements CalculatorInterface.Calculator1,CalculatorInterface{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
}
