package effective_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Practice_num120 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("./words.txt");
		
		Map<String, Long> freq;
		
        try (Stream<String> words = new Scanner(file).tokens()) {
            freq = words.collect(groupingBy(String::toLowerCase, counting()));
        }
		
	}

}
