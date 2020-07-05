package section7.exerciseCollect3;

import java.util.Arrays;
import java.util.List;

public class Employee implements Comparable{
	
	private long id;
	private String name;	
	private double salary;
	private Gender gender;
	private int age;
	
	public Employee(long id, String name, double salary, Gender gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static enum Gender{
		MAN,WOMAN;
	}
	
	public boolean isMan() {
		return this.gender == Gender.MAN;
	}
	
	public boolean isWoman() {
		return this.gender == Gender.WOMAN;
	}
		
	
	public static List<Employee> employees(){
		Employee emp1 = new Employee(10,"Juan",538.00,Gender.MAN,20);
		Employee emp2 = new Employee(7,"Maria",300.00,Gender.WOMAN,28);
		Employee emp3 = new Employee(6,"Andres",400.00,Gender.MAN,30);
		Employee emp4 = new Employee(9,"Camilo",600.00,Gender.MAN,22);
		Employee emp5 = new Employee(5,"Sebastian",700.00,Gender.MAN,29);
		Employee emp6 = new Employee(8,"Claudia",800.00,Gender.WOMAN,27);
		Employee emp7 = new Employee(1,"Esteban",200.00,Gender.MAN,24);
		Employee emp8 = new Employee(3,"Juliana",100.00,Gender.WOMAN,32);
		Employee emp9 = new Employee(4,"Arturo",350.00,Gender.MAN,25);
		Employee emp10 = new Employee(2,"Melissa",499.00,Gender.WOMAN,36);
		
		return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
	}
	
	//we must to override a comparable method
	@Override
	public int compareTo(Object o) {
		return this.getName().compareTo(((Employee)o).getName());
	}
	
}
