package section2.exercise1;

public class LambdaTest {

	public static void main(String[] args) {

		FunctionTest ft = () -> System.out.println("hello world");
		
		LambdaTest object = new LambdaTest();
		
		object.myMethod(ft);

	}
	
	public void myMethod(FunctionTest parameter) {
		parameter.hello();
	}

}
