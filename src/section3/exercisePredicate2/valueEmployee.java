package section3.exercisePredicate2;

import java.util.Arrays;
import java.util.List;

public class valueEmployee {
	
	public static void main(String[] args) {

		List<Employee> listEmployee = Arrays.asList(
				new Employee("Juan",20,6020,"Cobranzas"),
				new Employee("Andrea",30,1520,"Sales"),
				new Employee("Camilo",45,1520,"Developer"),
				new Employee("Maria",25,11520,"Marketing"),
				new Employee("Monica",18,5520,"Sales"),
				new Employee("Eva",23,1520,"HR")
				);
		
		Evaluator evaluator = new Evaluator();
		
		System.out.println("Employees with salaries > 5000");
		
		List<Employee> empHighSalaries = evaluator.evaluate(
				listEmployee, employee -> employee.getSalary()>5000);
		
		for(Employee employee : empHighSalaries) {
			System.out.println(employee.getName());
		}
		
		System.out.println("Employees with initial letter is M");
		
		List<Employee> emInitialJ = evaluator.evaluate(
				listEmployee, employee -> employee.getName().startsWith("M"));
		
		for(Employee employee : emInitialJ) {
			System.out.println(employee.getName());
		}
		
		System.out.println("Employees younger than 25");
		
		List<Employee> emYoungest = evaluator.evaluate(
				listEmployee, employee -> employee.getAge()<25);
		
		for(Employee employee : emYoungest) {
			System.out.println(employee.getName());
		}
		
		//functions class
		Functions func = new Functions();
		
		for(Employee employee : emYoungest) {
			double newSalary = func.incrementSalary(employee, 10, 
					(salary,increment) -> salary + (salary*increment)/100);
			employee.setSalary(newSalary);
		}
		
		System.out.println("Employees with new salaries");
		
		for(Employee employee : emYoungest) {
			System.out.println("Name "+employee.getName()+" Salary "+employee.getSalary());
		}
		
		//Predicate + biFunction
		System.out.println("Employees older than 25");
		
		List<Employee> emOldest = evaluator.evaluateReverse(
				listEmployee, employee -> employee.getAge()<25);
		
		for(Employee employee : emOldest) {
			System.out.println("Name "+employee.getName());
		}
	}
	
}
