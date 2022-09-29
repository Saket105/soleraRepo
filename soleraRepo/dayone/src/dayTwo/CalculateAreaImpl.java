package dayTwo;

public class CalculateAreaImpl implements CalculateArea{
	static int AREA;
	static int PERIMETER;

	@Override
	public int area(int length, int breadth) {
		// TODO Auto-generated method stub
		AREA = length*breadth;
		return AREA;
	}

	@Override
	public int perimeter(int length, int breadth) {
		// TODO Auto-generated method stub
		PERIMETER = 2*(length+breadth);
		return PERIMETER;
	}
	
	public void display() {
		System.out.println("Area is = "+AREA);
		System.out.println("Perimeter is = "+PERIMETER);
		
	}

}
