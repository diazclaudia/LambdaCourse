package section5.exerciseStream2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class createStream {

	public static void main(String[] args) {

		Stream<String> stream1 = Stream.of("programming course");
		stream1.forEach(System.out::println);
		
		Stream<String> stream2 = Stream.of("course1","course2","course3","course4");
		stream2.forEach(System.out::println);
		
		String[] array = {"java","c++","c#","html"};
		Stream<String> stream3 = Stream.of(array);
		stream3.forEach(System.out::println);
		
		Stream<Student> streamStudents = Stream.<Student>builder()
				.add(new Student("n01",17,1.70,9.5))
				.add(new Student("n02",15,1.80,8.0))
				.build();
		streamStudents.forEach(student -> System.out.println("* "+student.getIdentification()));
		
		IntStream oneToTwenty = IntStream.rangeClosed(1, 20);
		oneToTwenty.forEach(System.out::println);
	}

}
