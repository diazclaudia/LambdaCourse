package section3.exerciseBiF3;

import java.util.Arrays;
import java.util.List;

public class ExerciseBiFunction {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = Arrays.asList(
				new Employee("Andres", 8.5),
				new Employee("Juan", 10.5),
				new Employee("Monica", 7.2),
				new Employee("Juana", 10.5),
				new Employee("Nicolas", 4.5),
				new Employee("Camaron", 10.5),
				new Employee("Jose", 2.8)				
				);
		
		Calculator cal = new Calculator();
		
		List<Double> salaries = cal.calculator((salary,increment)->salary+(salary*increment)/100, employeeList, 16.3);
		
		salaries.forEach(System.out::println);
		
	}
}
