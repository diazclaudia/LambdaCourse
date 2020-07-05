package section5.exerciseStream8;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class operationMap {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 5)
				 .map(new IntUnaryOperator() {
					 @Override
					 public int applyAsInt(int number) {
						 return number * number;
					 }
				 })
				 .forEach(System.out::println);
		
		System.out.println("\n\nmult by 2");
		IntStream.rangeClosed(1,10)
				 .map(n -> n*2)
				 .forEach(System.out::println);
		
		List<Employee> employees = Employee.employees();
		
		System.out.println("\n\naverage salary from woman older than 25");
		double sum = employees.stream()
				 .filter(emp -> emp.isWoman())
				 .filter(emp -> emp.getAge() > 25)
				 .mapToDouble(emp -> emp.getSalary())
				 .sum();
				
		
		double average = sum/(employees.stream().filter(emp->emp.isWoman()).filter(emp->emp.getAge()>25).count());
		System.out.println("average: "+average);
	}

}
