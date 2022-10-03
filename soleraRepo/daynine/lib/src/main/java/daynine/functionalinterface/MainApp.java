package daynine.functionalinterface;

public class MainApp {

	public static void main(String[] args) {
		PrintInformation pii = new PrintInformationImpl();
		
		pii.printMessage("I am funtioncal Interface"); // calling the abstract method
		PrintInformation.printInformation(); //calling static method
		pii.printInfo(); //calling default method
		
		//Lambda Expression
		PrintInformation pi = (c)->System.out.println(c+" Hello I understood lambda expression and functional interface");
		pi.printMessage("Hi");
	}

}
