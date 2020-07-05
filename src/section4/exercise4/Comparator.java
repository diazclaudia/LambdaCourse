package section4.exercise4;

@FunctionalInterface
public interface Comparator<T> {

	public int compare(T o1, T o2);
	
//	in the comparator interface we have two abstract methods
//	we can do this because this equals method come from object class and it is a re-declaration from java.lang
	boolean equals(Object obj);
	
}
