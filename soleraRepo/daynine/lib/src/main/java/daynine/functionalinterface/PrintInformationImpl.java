package daynine.functionalinterface;

public class PrintInformationImpl implements PrintInformation {

	@Override
	public void printMessage(String message) {
		System.out.println("Good Morning Whereever you don't understand please interrupt" +"\n"+message);

	}
	
	public void display() {
		System.out.println("Hello");
	}

}
