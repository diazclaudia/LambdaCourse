package section3.exerciseComparator1;

import java.util.Comparator;

public class OrdenatePersonsById implements Comparator<Person> {
	
	@Override
	public int compare(Person o1, Person o2) {
		//returns -1, 0 , 1 depends of their parameters
		return o1.getId() - o2.getId();
	}
}
