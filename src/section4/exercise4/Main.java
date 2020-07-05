package section4.exercise4;

public class Main {

	public static void main(String[] args) {
		//method 5 
		System.out.println(" -> " + create().calculate(10, 2));
	}
	
	//method that returns lambda expression
	private static CalculatorLong create() {
		//long x; // error because the variable already exists in the lambda expression
		
		//return concrete object
		return (x,y)->x/y;
	}
}
