package section5.exerciseStream4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class createStream4 {

	public static void main(String[] args) {

		IntStream numStream = Arrays.stream(new int[] {1,2,3,4,5,6,});		
		System.out.println("numbers:");
		numStream.forEach(System.out::println);
						
		Stream<String> names = Arrays.stream(new String[] {"Juan","Pedro","Maria"})	;
		System.out.println("\nnames:");
		names.forEach(System.out::println);
		
		Set<String> idiomsSet = new HashSet<>();
		idiomsSet.add("Java");
		idiomsSet.add("c++");
		idiomsSet.add("html");
		idiomsSet.add("sql");
		
		Stream<String> idiomsStream = idiomsSet.stream();
		System.out.println("\nidioms:");
		idiomsStream.forEach(System.out::println);
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("n01",11,1.70,9.4));
		students.add(new Student("n02",10,1.60,9.1));
		students.add(new Student("n03",12,1.68,9.7));
		students.add(new Student("n04",10,1.78,8.8));
		students.add(new Student("n05",11,1.80,9.3));
		students.add(new Student("n06",9,1.57,8.0));
		
		Stream<Student> studentsStream = students.parallelStream();
		System.out.println("\nstudents stream:");
		studentsStream.forEach(student -> System.out.println(student.getIdentification()));
	}

}
