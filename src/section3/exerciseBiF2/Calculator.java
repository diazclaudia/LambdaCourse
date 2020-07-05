package section3.exerciseBiF2;

import java.util.function.BiFunction;

public class Calculator {
	
//	BiFunction<Integer,Integer,String> BiFunction receive two parameters and return one
	public String calculator(BiFunction<Integer,Integer,String> bi, Integer i1, Integer i2) {
			return bi.apply(i1, i2);
	}
}
