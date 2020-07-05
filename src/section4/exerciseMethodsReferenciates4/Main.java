package section4.exerciseMethodsReferenciates4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Main {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("10","20","30","40","50","60","70","80","90","100");
		
		//referenciate method by constructor
		getResults(numbers,Integer::parseInt).forEach(num->System.out.println(num*2));
		
		//using the static method
		getResults(numbers,Integer::parseInt).forEach(num->multBy10(num*2));
		
		//using referencies statics methods
		getResults(numbers,Integer::parseInt).forEach(Main::multBy10);
		
	}
	
	public static List<Integer> getResults(List<String> data,Function<String,Integer> func){
		List<Integer> results = new ArrayList<>();
		data.forEach(strNum -> results.add(func.apply(strNum)));
		return results;
	}
	
	public static void multBy10(int number) {
		System.out.println("\nthe new data value is "+number*10);
	}

}
