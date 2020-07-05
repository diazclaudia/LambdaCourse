package section7.exerciseCollect1;

import java.util.ArrayList;
import java.util.List;

public class CollectTest {

	public static void main(String[] args) {
		List<String> names = Employee.employees()
									 .stream()
									 .map(Employee::getName)
									 .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println(names);

	}

}
