package section5.exerciseStream3;

import java.util.Random;
import java.util.stream.Stream;

public class createStream3 {

	public static void main(String[] args) {

		Stream<Long> firstTen = Stream.iterate(1L, n -> n+1)
				 				.limit(10);
		
		firstTen.forEach(System.out::println);
		
		System.out.println("\n\n");		
		Stream.iterate(1L, n -> n+1)
						.filter(n -> n%2 == 0)
						.limit(20)
						.forEach(System.out::println);
		
		System.out.println("\n\nAfter 100");
		Stream.iterate(1L, n -> n+1)
						.filter(n -> n%2 == 0)
						.skip(100)
						.limit(5)
						.forEach(System.out::println);
		
		System.out.println("\n\nRandom numbers");
		Stream.generate(Math::random)
						.limit(5)
						.forEach(System.out::println);
		
		System.out.println("\n\nRandom Integers");
		new Random().ints()
					.limit(5)
					.forEach(System.out::println);
						
						
	}

}
