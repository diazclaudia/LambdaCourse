package section3.exerciseComparator1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ordenation {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Carlos","Ana","Matias","German");
		
		System.out.println("list before order "+names);
		
		Collections.sort(names);
		
		for(String name : names) {
			System.out.println("Name "+name);
		}		
				
		List<Person> persons = Arrays.asList(
											new Person(1,"Mario"),
											new Person(4,"Fernando"),
											new Person(5,"Omar"),
											new Person(2,"Juana"),
											new Person(3,"Camilo")
											);
										
		Collections.sort(persons);
		System.out.println("\n\nlist after order ");
		for(Person person : persons) {
			System.out.println("Name "+person.getName());
		}

		
		Collections.sort(persons, new OrdenatePersonsById());		
		System.out.println("\n\npersons list order by id ");
		for(Person person : persons) {
			System.out.println("Name "+person.getName());
		}
		
		Collections.sort(persons, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getId() - o2.getId();
			}
		});
		
		System.out.println("\n\npersons list order by id ");
		for(Person person : persons) {
			System.out.println("Name "+person.getName());
		}
		
		System.out.println("\n\npersons list order by id *");
		Collections.sort(persons,(p1,p2) -> p1.getId()-p2.getId());
		for(Person person : persons) {
			System.out.println("Name "+person.getName());
		}		
	}
	
}
