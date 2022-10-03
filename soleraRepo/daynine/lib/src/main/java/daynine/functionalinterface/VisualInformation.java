package daynine.functionalinterface;

public interface VisualInformation {
	
	//public void printVisualInfo();
		
	public default void printVisualInformation() {
		System.out.println("Functional interface is extending non functional interface");
	}

}
