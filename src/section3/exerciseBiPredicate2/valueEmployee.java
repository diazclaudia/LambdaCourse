package section3.exerciseBiPredicate2;

import java.util.Arrays;
/**
 * Obtain a report with all employees that:
 * 1. more than 25 years and are in the sales department or
 * 2. more than 25 years and are int HR
 */
import java.util.List;
import java.util.function.BiPredicate;

public class valueEmployee {
		
	public static void main(String[] args) {

		List<Employee1> listEmployee = Arrays.asList(
				new Employee1("Juan",20,6020,"Cobranzas"),
				new Employee1("Andrea",30,1520,"Sales"),
				new Employee1("Camilo",45,1520,"HR"),
				new Employee1("Maria",25,11520,"Marketing"),
				new Employee1("Monica",18,5520,"Sales"),
				new Employee1("Eva",23,1520,"HR")
				);
		
		Evaluator evaluator = new Evaluator();
	
		BiPredicate<Integer,String> firstCriterium = 
				(age,department) -> ((age >= 25) && (department.equals("Sales")));  
				
		BiPredicate<Integer,String> secondCriterium = 
				(age,department) -> ((age >= 25) && (department.equals("HR")));  		
								
		BiPredicate<Integer,String> criterium = firstCriterium.or(secondCriterium); 
				
		System.out.println("Employees HR or sales older than 25");
		
		List<Employee1> finalList = evaluator.evaluate(listEmployee, criterium);
		
		for(Employee1 employee : finalList) {
			System.out.println("Name "+employee.getName()+
								" Age "+employee.getAge()+
								" Department "+employee.getDepartment()
			);
		}
		

		
		
	}
	
}
