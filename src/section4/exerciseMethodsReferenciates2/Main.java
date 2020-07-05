package section4.exerciseMethodsReferenciates2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person(11,"Mario","mario@gmail.com"),
				new Person(14,"Fernando","fernando@gmail.com"),
				new Person(15,"Omar","omar@gmail.com"),
				new Person(12,"Juana","juana@gmail.com"),
				new Person(13,"Camilo","camilo@gmail.com")
				);
		
		
		//using existing methods
		ProveedorComparations comparator = new ProveedorComparations();		
		Collections.sort(persons,(p1,p2)-> comparator.compareByName(p1,p2));
		System.out.println("\n\nexisting methods");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));
		
		//using referencies methods
		Collections.sort(persons,comparator::compareByName);
		System.out.println("\n\nreferencies methods");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));

		
	}

}
