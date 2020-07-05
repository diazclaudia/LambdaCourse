package section3.exerciseBiConsumer1;

import java.util.function.BiConsumer;

public class InterfaceBiConsumerTest {

	public static void main(String[] args) {
		BiConsumer<Double,Double> biConsumer = (num1,num2) -> {
			double mult = num1 * num2;
			System.out.println("the result is "+mult);
		};
		
		biConsumer.accept(15.2, 52.25);

	}

}
