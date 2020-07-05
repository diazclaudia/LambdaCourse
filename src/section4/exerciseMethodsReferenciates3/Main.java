package section4.exerciseMethodsReferenciates3;

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
		
		
		//using referencies methods of instances by arbitrary type
		Collections.sort(persons,(per1,per2) -> per1.compareByAge2(per2));
		System.out.println("\n\nusing referencies methods of instances by arbitrary type");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));
		
		//using method referenciates
		Collections.sort(persons,Person::compareByAge2);//(per1,per2) -> per1.compareByAge2(per2)
		System.out.println("\n\nreferencies methods");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));
		
	}

}
