package effective_practice;

import java.util.ArrayList;
import java.util.List;

public class Practice_num85 {

	
	static <T> List<T>  flatten(List<List<? extends T>> lists){
	   List<T> result = new ArrayList<>();
	        
	    for (List<? extends T> list : lists){
	        result.addAll(list);
	    }

	    return result;
	}
	
	public static void main(String[] args) {

		
		
	}

}
