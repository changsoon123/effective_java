package effective_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice_num134 {

	static class CollectionClassifier {
	   
	    public static String classify(Collection<?> c) {
	        return c instanceof Set ? "집합" : c instanceof List ? "리스트" : "그 외";
	        	   
	    }
	}

	
	public static void main(String[] args) {

		
		Collection<?>[] collections = {
	            new HashSet<>(),
	            new ArrayList<>(),
	            new HashMap<>().values()
	    };

	    for (Collection<?> collection : collections) {
	        System.out.println(CollectionClassifier.classify(collection));
	    }
		
		
	}

}
