package section3.exerciseConsumer2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		List<Student> studentsList = Arrays.asList(
				new Student("Jonh",6),
				new Student("George",5),
				new Student("Andrew",10),
				new Student("Matias",9),
				new Student("Stefany",8),
				new Student("Claudia",4),
				new Student("Nataly",6),
				new Student("James",5),
				new Student("Peter",9)				
				);
		
		StudentOperations op = new StudentOperations();
	/*	
		System.out.println("Students without update calification");
		Consumer<Student> cons1 = e -> System.out.println("Name "+e.getName() +" Calification "+e.getCalification());		
		op.acceptStudents(studentsList, cons1);
		
		
		//incremets calification in 15%
		//update calification
		Consumer<Student> cons2 = e -> e.setCalification(e.getCalification()*1.15);
		op.acceptStudents(studentsList, cons2);
		
		
		//prints califications update
		System.out.println("\nStudents with update calification 15%\n");
		op.acceptStudents(studentsList, cons1);
		*/
		
		//call other consumer method****
		
	
		Consumer<Student> cons3 = e -> System.out.println("Name "+e.getName() +" Calification "+e.getCalification());	
		
		System.out.println("\n\n--Students without update calification *\n");
		op.acceptStudents(studentsList, cons3);
		
		Consumer<Student> cons4 = e -> e.setCalification(e.getCalification()*1.15);
				
		//first increments and then prints with cons1
		Consumer<Student> cons5 = cons4.andThen(cons3);
		
		System.out.println("\nStudents with update calification 15% *\n");
		op.acceptStudents(studentsList, cons5);
		
		
	}

}
