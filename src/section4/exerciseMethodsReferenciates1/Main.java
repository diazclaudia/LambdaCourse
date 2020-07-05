package section4.exerciseMethodsReferenciates1;

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
		
		System.out.println("persons without order");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));
		
		//using the collections method
		Collections.sort(persons, (person1,person2)->person1.getAge().compareTo(person2.getAge()));
		
		System.out.println("\n\npersons with order");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));
		
		//using the person method
		Collections.sort(persons, (person1,person2)->Person.compareByAge(person1, person2));
		
		System.out.println("\n\npersons with order");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));
		
		//using referencies methods
		Collections.sort(persons,Person::compareByAge);
		System.out.println("\n\nreferencies methods");		
		persons.forEach(p->System.out.println(p.getName()+ " age "+p.getAge()));
	}

}
