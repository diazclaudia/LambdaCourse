package section3.exercisePredicate2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluator {
	
//	employees than pass the evaluation
	public List<Employee> evaluate(List<Employee> listEmp, Predicate<Employee> eval){
		List<Employee> newList = new ArrayList<>();
		
		for(Employee employee : listEmp) {
			if(eval.test(employee)) {
				newList.add(employee);
			}
		}
		
		return newList;
		
	}
	
	public List<Employee> evaluateReverse(List<Employee> listEmp, Predicate<Employee> eval){
		List<Employee> newList = new ArrayList<>();
		
		for(Employee employee : listEmp) {
			if(eval.negate().test(employee)) {
				newList.add(employee);
			}
		}
		
		return newList;
		
	}
}
