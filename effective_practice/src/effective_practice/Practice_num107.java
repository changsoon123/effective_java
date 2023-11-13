package effective_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice_num107 {

	
	
	public static void main(String[] args) {

		List<String> words = null;
		
		Collections.sort(words, new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        return Integer.compare(s1.length(), s2.length());
		    }
		});
		
		Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		Collections.sort(words, Comparator.comparingInt(String::length));
		
		
		words.sort(Comparator.comparingInt(String::length));
		
		 
		String[] names = {"Alice", "Bob", "Charlie", "David"};

		
        Arrays.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        

        
        for (String name : names) {
            System.out.println(name);
        }
        
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // 로 타입 사용 (비권장)
        List<String> list = stringList;

        // 람다 표현식 사용 (타입 추론 어려움)
        list.forEach(element -> System.out.println((element).toUpperCase()));
		
        
	}

}
