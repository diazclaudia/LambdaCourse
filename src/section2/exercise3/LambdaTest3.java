package section2.exercise3;

public class LambdaTest3 {

	public static void main(String[] args) {

		engine((x,y) -> x+y);
		engine((x,y) -> x-y);
		engine((x,y) -> x*y);
		engine((x,y) -> x/y);
		engine((x,y) -> x%y);
		

	}

	private static void engine(Calculator cal) {
		int x = 2, y = 4;
		int result = cal.calculate(x, y);
		System.out.println(result);
	}

}
