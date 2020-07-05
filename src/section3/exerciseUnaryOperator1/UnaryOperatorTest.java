package section3.exerciseUnaryOperator1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		//UnaryOperator receive and returns the same parameter type
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		List<Integer> listAdd = operatorUnary(num-> num*num, list);
		
		listAdd.forEach(System.out::println );

	}
	
	public static List<Integer> operatorUnary(UnaryOperator<Integer> unaryOpe,List<Integer> list){
		
		List<Integer> actualList = new ArrayList<>();
		
		list.forEach(num -> actualList.add(unaryOpe.apply(num)));
		
		return actualList;
	}

}
