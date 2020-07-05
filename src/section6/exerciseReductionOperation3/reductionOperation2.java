package section6.exerciseReductionOperation3;

import java.util.stream.IntStream;

public class reductionOperation2 {

	public static void main(String[] args) {
		
		//with summaryStatistics
		System.out.println(IntStream.range(1, 20).summaryStatistics());
		
		//sum range
		System.out.println(IntStream.range(1, 20).summaryStatistics().getSum());
		
	}

}
