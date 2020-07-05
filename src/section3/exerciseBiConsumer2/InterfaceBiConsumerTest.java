package section3.exerciseBiConsumer2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InterfaceBiConsumerTest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		String[][] array = { { "Chris", "USA" }, { "Aladin", "India" }, { "Mary", "Canada" } };

		for (int i = 0; i < array.length; i++) {
			map.put(array[i][0], array[i][1]);
		}

		System.out.println("Traditional print way ");
		
		Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
		if(iter != null) {
			while(iter.hasNext()) {
				Map.Entry<String, String> entry = iter.next();
				System.out.println("Clave "+entry.getKey()+" valor "+entry.getValue());
			}
		}
		
		System.out.println("\n\nNew print way ");
		map.forEach((key,value)->{System.out.println("Clave "+key+" value "+value);});

	}
}
