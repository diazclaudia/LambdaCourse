package section5.exerciseStream5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class createStream5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String enter = sc.nextLine();

		IntStream streamChars = enter.chars();
		//streamChars.forEach(System.out::println);
		
		System.out.println("\nwithout spaces and numbers:");
		//characters different to digit and white space
		streamChars.filter(n -> !Character.isDigit((char) n)
							&& !Character.isWhitespace((char) n))
							.forEach(n -> System.out.print((char) n));
		
		System.out.println("\nidioms:");
		String str = "html, css, java, node, sql, c++";
		Pattern.compile(", ")
				.splitAsStream(str)
				.forEach(System.out::println);;
	}

}
