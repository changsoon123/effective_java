package effective_practice;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Practice_num33 {

	public static void main(String[] args) {

		Set<String> s = new TreeSet<>();
		Collections.addAll(s, args);
		System.out.println(s);
		
	}

}
