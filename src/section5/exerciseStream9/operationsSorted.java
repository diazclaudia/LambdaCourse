package section5.exerciseStream9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class operationsSorted {

	public static void main(String[] args) {
		
		System.out.println("\n\norder names: ");
		
		Arrays.asList("Alfredo","Maria","Daniel","Juana")
					 .stream()
					 .sorted()
					 .forEach(System.out::println);
		
		System.out.println("\n\norder numbers: ");
		
		Arrays.asList(1,2,3,4,5,1,4,7,8,3,5,2,1,3)
					 .stream()
					 .sorted()
					 .forEach(System.out::println);
		
		System.out.println("\n\norder employees by name: ");
		
		List<Employee> employees = Employee.employees();
		
		employees.stream()
				 .sorted()
				 .forEach(emp -> System.out.println(emp.getName()));
		
		System.out.println("\n\norder employees by age: ");
		
		employees.stream()
				 .sorted(new Comparator<Employee>() {
					@Override
					public int compare(Employee emp1,Employee emp2) {
						return emp1.getAge() - emp2.getAge();
					}
				})
				.forEach(emp->System.out.println("name: "+emp.getName()+" age "+emp.getAge()));
		
		System.out.println("\n\norder employees by salary and older than 25: ");
		employees.stream()
				 .filter(emp -> emp.getAge() > 25)
				 .sorted((emp1,emp2)-> (int)(emp1.getSalary()-emp2.getSalary()))
				 .forEach(emp -> System.out.println("name: "+emp.getName()+" salary "+emp.getSalary()));
	}

}
