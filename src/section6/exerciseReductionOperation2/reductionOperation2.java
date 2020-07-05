package section6.exerciseReductionOperation2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class reductionOperation2 {

	public static void main(String[] args) {
		
		//traditional way
		System.out.println("return one sum value: ");
		int[] numbers = {4,5,8,7,9,6,2,2,1,4};
		
		int sum = IntStream.of(numbers)
							.reduce(0, Integer::sum);
		
		System.out.println("the sum is "+sum);
		
		String file = ".\\src\\section6\\exerciseReductionOperation2\\file.txt";
		Path path1 = Paths.get(file);
		String text = "";
		try(Stream<String> lines = Files.lines(path1)){
			text = lines.map(line -> line.replace("a","A"))
						.reduce("",(line1,line2) -> line1.concat("\n").concat(line2));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(".\\src\\section6\\exerciseReductionOperation2\\file2.txt"))){
			System.out.println("text "+text);
			bw.write(text);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		Path dir = Paths.get(".");
		System.out.printf("\n the proyect tree files for the proyect is: ",dir.toAbsolutePath());
		
		try(Stream<Path> paths = Files.walk(dir)){
			paths.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
