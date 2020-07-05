package section7.exerciseCollect2;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectTest2 {

	public static void main(String[] args) {
		
		List<String> names = Employee.employees()
									 .stream()
									 .map(Employee::getName)
									 .collect(Collectors.toList());
		System.out.println("List: "+names);
		
		//no repeat Set
		Set<String> names2 = Employee.employees()
									 .stream()
									 .map(Employee::getName)
									 .collect(Collectors.toSet());
		System.out.println("Set: "+names2);
		
		//order object treeSet
		Set<String> names3 = Employee.employees()
				 .stream()
				 .map(Employee::getName)
				 .collect(Collectors.toCollection(TreeSet::new));
		System.out.println("TreeSet: "+names3);

	}

}
