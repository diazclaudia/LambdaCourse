package section7.exerciseCollect3;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectTest3 {

	public static void main(String[] args) {
		
		Map<Long, String> idNameMap = Employee.employees()
											  .stream()
											  .collect(Collectors.toMap(
													  Employee::getId, Employee::getName));
		
		System.out.println("Map "+idNameMap);
		
		System.out.println("Group by gender ");
		
		Map<Employee.Gender,String> genderNameMap = Employee.employees()
															.stream()
															.collect(Collectors.toMap(
																	Employee::getGender, Employee::getName,
																	(nom1,nom2)->String.join(", ",nom1,nom2)));//concatenate by gender
		
		System.out.println("genderNameMap "+genderNameMap);

	}

}
