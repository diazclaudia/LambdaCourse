package section5.exerciseStream6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class createStream6 {

	public static void main(String[] args) {
		Path path1 = Paths.get(".\\bin\\section5\\exerciseStream6\\file.txt");
		
		try (Stream<String> lines = Files.lines(path1)){//open and read the file
			lines.forEach(
				line -> {
					System.out.println("line: ");
				    System.out.println(line);
				}
			);
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
