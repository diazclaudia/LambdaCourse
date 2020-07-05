package section3.exercisePredicate2;

import java.util.function.BiFunction;

public class Functions {
	public double incrementSalary(Employee emp, double increment, BiFunction<Double, Double, Double> bi) {
		return bi.apply(emp.getSalary(), increment);
	}
}
