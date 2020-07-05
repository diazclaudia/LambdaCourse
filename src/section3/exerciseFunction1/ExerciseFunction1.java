package section3.exerciseFunction1;

import java.util.function.Function;

public class ExerciseFunction1 {
	
	public static void main(String[] args) {
		
		Function<Integer,String> converter = x -> Integer.toString(x);
		
		System.out.println(converter.apply(3));
		System.out.println(converter.apply(30).length());
	}
}
