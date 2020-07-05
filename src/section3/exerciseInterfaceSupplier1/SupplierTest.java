package section3.exerciseInterfaceSupplier1;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		Supplier<String> i = () -> "Claudia";
		
		System.out.println("The last value is: "+i.get());

	}

}
