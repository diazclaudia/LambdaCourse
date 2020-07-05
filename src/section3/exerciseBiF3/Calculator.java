package section3.exerciseBiF3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculator {
	
//	BiFunction<Integer,Integer,String> BiFunction receive two parameters and return one
	public List<Double> calculator(BiFunction<Double,Double,Double> bi, List<Employee> listEm, Double increment) {
		
		List<Double> salaryList = new ArrayList<Double>();
		
		for(Employee employee : listEm) {
			salaryList.add(bi.apply(employee.getSalary(), increment));
		}
		
		return salaryList;
	}
}