package section3.exerciseConsumer2;

import java.util.List;
import java.util.function.Consumer;

public class StudentOperations {
	
	public void acceptStudents(List<Student> students,Consumer<Student> cons) {
		for(Student student : students) {
			cons.accept(student);
		}
	}

}
