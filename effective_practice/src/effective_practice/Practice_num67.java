package effective_practice;

import java.util.ArrayList;
import java.util.List;

public class Practice_num67 {

	
	
	public static void main(String[] args) {

	List<String> strings = new ArrayList<>();
	unsafeAdd(strings, Integer.valueOf(42));
	String s = strings.get(0);
		
	}
	
	private static void unsafeAdd(List<Object> list, Object o) {
		list.add(o);
	}
	

}
