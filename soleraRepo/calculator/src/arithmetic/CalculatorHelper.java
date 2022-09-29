package arithmetic;

public class CalculatorHelper implements CalculatorInterface {

	private int a, b;
	private int res1=0;

	public CalculatorHelper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CalculatorHelper(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int sub(int a, int b) {
		return  a-b;
		
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		return a/b;
	}

	public void calculate(int operator) {
		CalculatorHelper cal = new CalculatorHelper();
		switch (operator) {
		case 1:
			System.out.println(cal.add(a, b));
			break;
		case 2:
			System.out.println(cal.sub(a, b));
			break;
		case 3:
			System.out.println(cal.mul(a, b));
			break;
		case 4:
			System.out.println(cal.div(a, b));
			break;
			default:
				System.out.println("Wrong Input");
				break;
		}
	}

	

}
