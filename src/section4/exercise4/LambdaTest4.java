package section4.exercise4;


public class LambdaTest4 {
	
	public static void main(String[] args) {
	//exercise about calculator operations int and long
		
		//method 1
		engine((long x,long y)->x+y);
		
		//method 2 with cast
		engine((CalculatorLong)(x,y)->x+y);
		
		//method 3 initialize the object
		CalculatorInt calI = (x,y)->x+y;
		engine(calI);
		
		CalculatorLong calL = (x,y)->x+y;
		engine(calL);
		
		//method 4 short
		CalculatorInt caI2 =  (num,num2) -> num/num2;		
		System.out.println("* "+caI2.calculate(30, 15));

		
	}

	public static void engine(CalculatorLong cal) {
		long x=2,y=4;
		long result = cal.calculate(x, y);
		System.out.println("I "+result);
	}
	
	public static void engine(CalculatorInt cal) {
		int x=2,y=4;
		int result = cal.calculate(x, y);
		System.out.println("L "+result);
	}
}
