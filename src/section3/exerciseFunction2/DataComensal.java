package section3.exerciseFunction2;

import java.util.function.Function;

public class DataComensal {

	public static void main(String[] args) {

		Comensal com = new Comensal("Javier",256.2,5);
		String nameComensal = (String) getDatoComensal(com, x -> x.getName());
		int table = (int) getDatoComensal(com, x -> x.getTable());
		
		System.out.println("the comensal name is "+nameComensal);
		System.out.println("the comensal table is "+table);

	}

	private static Object getDatoComensal(Comensal com, Function<Comensal,Object> func) {
		
		return func.apply(com);
	}

}
