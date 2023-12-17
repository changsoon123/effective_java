package effective_practice;

import java.util.Comparator;

public class Practice_num148 {

//	static Integer i;
	
	public static void main(String[] args) {
		
//		if (i == 42)
//            System.out.println("믿을 수 없군!");

//		Comparator<Integer> naturalOrder = (i,j) -> (i < j) ? -1 : (i == j ? 0 : 1);
//
//		
//		System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));
		
//		Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
//		    int i = iBoxed, j = jBoxed;
//		    return i < j ? -1 : (i == j ? 0 : 1);
//		};
//		
//		System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));
		
		Long sum = 0L;
	    for (long i = 0; i <= Integer.MAX_VALUE; i++) {
	        sum += i;
	    }
	    System.out.println(sum);
		
	}

}

