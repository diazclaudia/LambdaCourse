package section2.exercise2;

public class LambdaTest2 {

	public static void main(String[] args) {

		Operations op = (num1, num2) -> System.out.println(num1 + num2);
		op.sum(25, 30);

		LambdaTest2 object = new LambdaTest2();		
		object.myMethod((num1, num2) -> System.out.println("param1: " + num1 + " param2: " + num2), 25, 30);

	}

	public void myMethod(Operations op, int num1, int num2) {

		op.sum(num1, num2);
	}

}
