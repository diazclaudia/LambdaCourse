package section6.exerciseReductionOperation1;


import java.util.List;
import java.util.stream.IntStream;

public class reductionOperation {

	public static void main(String[] args) {
		
		//traditional way
		System.out.println("return one sum value: ");
		int[] numbers = {4,5,8,7,9,6,2,2,1,4};
		
		int sum = 0;
		for(int num : numbers) {
			sum += numbers[num];
		}
		System.out.println("sum: "+sum);
		
		//using streams		
		
		//reduction with numbers
		
		//sum elements
		System.out.println("the sum is: " +
							IntStream.of(numbers).sum());
		
		//obtain average
		System.out.println("the average is: "+
							IntStream.of(numbers).average().getAsDouble());
		
		//obtain min and max
		System.out.println("the max value: "+
							IntStream.of(numbers).max().getAsInt());
		
		System.out.println("the min value: "+
				IntStream.of(numbers).min().getAsInt());
		
		//count elements
		System.out.println("count elements "+
							IntStream.of(numbers).count());
		
		System.out.println("\n\noperations with employees and streams");
		List<Employee> employees = Employee.employees();
		
		System.out.println("sum salaries "+
							employees.stream()
									 .mapToDouble(Employee::getSalary)
									 .sum());	
		
		//employee with the max salary
		Employee empMax = employees
						  .stream()
						  .max(
								  (emp1,emp2) -> (int)(emp1.getSalary()-emp2.getSalary()))
						  .get();
		
		System.out.println("\n\nemployee with max salary "+
						  empMax.getName() + " salary "+empMax.getSalary());
		
		

		
	}

}
