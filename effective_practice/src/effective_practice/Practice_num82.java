package effective_practice;

import java.util.ArrayList;
import java.util.List;

public class Practice_num82 {

	public static void dangerous(List<String>... stringLists) {
		
	    List<Integer> intList = List.of(42);
	    
	    Object[] objects = stringLists;
	    
	    objects[0] = intList;
	    
	    String s = stringLists[0].get(0); 
	    
	    System.out.println(s);
	}
	
	public static void main(String[] args) {

		  Practice_num82 test = new Practice_num82();
		  
		  List<String> stringList = new ArrayList<>();
		  
		  test.dangerous(stringList);
		
		
	}

}

