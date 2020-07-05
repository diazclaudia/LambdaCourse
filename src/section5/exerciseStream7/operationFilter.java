package section5.exerciseStream7;

import java.util.List;
import java.util.function.Predicate;

public class operationFilter {

	public static void main(String[] args) {
		List<Employee> employees = Employee.employees();
		
		 System.out.println("Men employees: ");
		//runs the employees and do the validation, if it is man that charge in the new stream
		employees.stream()
				 .filter(new Predicate<Employee>() {
					 @Override
					 public boolean test(Employee emp) {
						 return emp.isMan();
					 }
				 })
				 .forEach(emp -> System.out.println(emp.getName()+", gender: "+emp.getGender()));
		
		System.out.println("\n\nWomen employees: ");
		
		employees.stream()
				 .filter(Employee::isWoman)
				 .forEach(emp -> System.out.println(emp.getName()+", gender: "+emp.getGender()));
		
		System.out.println("\n\nEmployees order than 25: ");
		
		employees.stream()
				 .filter(emp -> emp.getAge() > 25)
				 .forEach(emp -> System.out.println(emp.getName()+", age: "+emp.getAge()));
		
		
		System.out.println("\n\nmen employees that their name starts with A letter: ");
		
		employees.stream()
				 .filter(Employee::isMan)
				 .filter(emp -> emp.getName().startsWith("A"))
				 .forEach(emp -> System.out.println(emp.getName()+", gender: "+emp.getGender()));
		
		System.out.println("\n\nmen employees that their salary > 500: ");
		
		employees.stream()
				 .filter(emp -> emp.isMan() && emp.getSalary()>500)
				 .forEach(emp -> System.out.println(emp.getName()+", salary: "+emp.getSalary()));
		
		System.out.println("\n\nusing predicates: ");
		System.out.println("\nwomen employees that their salary > 300 and older than 25: ");
		
		Predicate<Employee> empFemale = emp -> emp.isWoman();
		Predicate<Employee> empOlder = emp -> emp.getAge() > 25;
		Predicate<Employee> empSalary = emp -> emp.getSalary() > 300;
		Predicate<Employee> fem25300 = empFemale.and(empOlder).and(empSalary);
		employees.stream()
				 .filter(fem25300)
				 .forEach(emp -> System.out.println(emp.getName()+", gender: "+emp.getGender()+", salary: "+emp.getSalary()));
		
		System.out.println("* total employees: "+employees.stream().filter(fem25300).count());
		
	}

}
