package section5.exerciseStream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> numStream = numbers.stream();
		
		int sum = numStream.filter(n -> n%2 == 1) //filter by odd numbers {1,3,5}
				.map(n -> n * n) //do operation {1,9,25}
				.reduce(0,(n1,n2) -> n1 + n2); //sum the contains
		
		System.out.println("the sum odd numbers is "+sum);
		
		
		//referencies methods
		Stream<Integer> numStream1 = numbers.stream();
		
		int sum1 = numStream1.filter(n -> n%2 == 1) //filter by odd numbers {1,3,5}
				.map(n -> n * n) //do operation {1,9,25}
				.reduce(0,Integer::sum); //sum the contains
		
		System.out.println("the sum odd numbers is * "+sum1);
	}

}
