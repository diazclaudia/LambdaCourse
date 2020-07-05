package section4.exerciseMethodsReferenciates1;

public class Person{
	private Integer age;
	private String name;
	private String email;
	
	public Person(Integer age, String name,String email) {
		super();
		this.age = age;
		this.name = name;
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public static int compareByAge(Person a, Person b) {		
		return a.getAge().compareTo(b.getAge());
	}
	
	
}
