package daynine.functionalinterface;

//A functional interface can extends another interface only when 
//it does not have any abstract method
@FunctionalInterface
public interface VisualInfo extends VisualInformation{

				public void visualInfo();
}
