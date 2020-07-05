package section4.exerciseMethodsReferenciates3;

public class ProveedorComparations {
	
	public int compareByName(Person per1, Person per2) {
		return per1.getName().compareTo(per2.getName());
	}
	
	public int compareByAge(Person per1, Person per2) {
		return per1.getAge().compareTo(per2.getAge());
	}
}
