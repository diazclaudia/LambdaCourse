package section2.exercise4;

public class LambdaTest4 {

	public static void main(String[] args) {

		CalculatorInt calI = (x,y) -> x+y;
		CalculatorLong calL = (x,y) -> x+y;
		
		engine(calL);
		engine(calI);
		
		
	}

	private static void engine(CalculatorLong cal) {
		long x = 2, y = 4;
		System.out.println(cal.calculate(x, y));
	}
	
	private static void engine(CalculatorInt cal) {
		int x = 3, y = 4;
		System.out.println(cal.calculate(x, y));
	}

}
