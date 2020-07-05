package section3.exerciseBinaryOperator1;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		
		// BinaryOperator receive two parameter by same type and return one parameter with same type		
		BinaryOperator<Integer> biOperator = (num1,num2) -> num1 * num2;
		
		//aplicate the apply method
		int result = biOperator.apply(10, 20);
		System.out.println("the result is "+result);
		
		//use minBy
		BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
		result = bOperatorMin.apply(10, 20);
		System.out.println("the result min is: "+result);
		
		//use maxBy
		BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));
		result = bOperatorMax.apply(10, 20);
		System.out.println("the result max is: "+result);
	}

}
