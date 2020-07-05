package section3.exerciseFunction2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DataComensals {

	public static void main(String[] args) {

		List<Comensal> listComensals = Arrays.asList(
				new Comensal("Javier",10,5),
				new Comensal("Juan",12,7),
				new Comensal("Andrea",8,2),
				new Comensal("Juliana",4,3),
				new Comensal("Marina",7,7)
				);

		List<Object> nameComensals = getDataComensals(listComensals,x -> x.getName());	
		
		nameComensals.forEach(System.out::println);
	}

	private static List<Object> getDataComensals(List<Comensal> listComensal, Function<Comensal,Object> func) {
		
		List<Object> listData = new ArrayList<>();
		for(Comensal comensal : listComensal) {
			listData.add(func.apply(comensal));
		}
		return listData;
	}

}
