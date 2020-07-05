package section3.exerciseBiPredicate2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluator {
	
//	employees than pass the evaluation
	public List<Employee1> evaluate(List<Employee1> listEmployee, BiPredicate<Integer,String> eval){
		
		List<Employee1> newList = new ArrayList<>();
		
		for(Employee1 employee : listEmployee) {
			if(eval.test(employee.getAge(),employee.getDepartment())) {
				newList.add(employee);
			}
		}
		
		return newList;
		
	}
	
}
