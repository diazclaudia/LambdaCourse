package section3.exerciseConsumer1;

import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		
		//acepts enter value and not return
		Consumer<String> cons = x -> System.out.println(x.toUpperCase());
		
		cons.accept("Claudia");
	}
}
