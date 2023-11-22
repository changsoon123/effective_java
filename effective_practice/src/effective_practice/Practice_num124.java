package effective_practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice_num124 {

	public static void main(String[] args) {

		List<String> words = List.of("apple", "banana", "orange", "avocado", "blueberry", "blackberry");

        // 기본적인 groupingBy
        Map<Integer, List<String>> lengthGroups = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Default groupingBy: " + lengthGroups);

        
        Map<Integer, List<String>> customGroups = words.stream()
                .collect(Collectors.groupingBy(String::length,
                        CustomHashMap::new,
                        Collectors.toList()));

        System.out.println("Custom groupingBy: " + customGroups);
		
	}

}

class CustomHashMap extends java.util.HashMap<Integer, List<String>> {
	
	
}