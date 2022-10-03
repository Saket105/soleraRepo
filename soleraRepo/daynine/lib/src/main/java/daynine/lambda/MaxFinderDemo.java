package daynine.lambda;

import java.util.ArrayList;
import java.util.List;

public class MaxFinderDemo {

	public static void main(String[] args) {
		//traditional approach
		MaxFinder finder = new MaxFinderImpl() ;
		int result =finder.maximum(10, 20);
		System.out.println(result);
		// Using Lambda expression
		//Return type of lambda expression is Functional Interface
		//Lambda Expression represents an instance of Functional Interface
		//A Lambda expression is an anonymous block of code that encapsulates an 
		//expression or a block of statements and returns a result
		//(argument list) -> {implementation}
		
		MaxFinder maxFinder =(num1,num2)->  num1>num2?num1:num2;
		System.out.println(maxFinder);
		System.out.println(maxFinder instanceof FunctionalInterface);
		
		int max = maxFinder.maximum(10,20);
		System.out.println(max);
		System.out.println("*****************************");
		List<String> currencies = new ArrayList<String>();
		currencies.add("USD");
		currencies.add("INR");
		currencies.add("YEN");
		currencies.add("YUAN");
		currencies.add("EURO");
		currencies.add("AUD");
		currencies.forEach(c->System.out.println(c));
		System.out.println(currencies);
	}

}
