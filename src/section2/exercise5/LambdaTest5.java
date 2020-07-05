package section2.exercise5;

public class LambdaTest5 {

	public static void main(String[] args) {

		System.out.println(create().calculate(2,2));
		
	}

	private static CalculatorLong create() {
		return (x,y) -> x/y;
	}
	

}
