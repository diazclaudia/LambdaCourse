package section3.exerciseBiF1;

import section3.exerciseBiF2.Calculator;

public class ExerciseBiFunction {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		String result = calculator.calculator((x,y) -> " : " + (x*y), 60,10);
		
		System.out.println("the result is " + result);
	}
}
