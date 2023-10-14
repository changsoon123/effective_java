package effective_practice;

import java.util.HashSet;
import java.util.Set;

public class Practice_num68 {

	// 동작은 하지만 raw 타입을 사용해 안전하지 않다
	static int numElementsInCommon(Set<?> s1, Set<?> s2) {
	  int result = 0;
	  for( Object o1 : s1 )
	    if( s2.contains(o1) )
	      result++;
	  return result;
	}
	
	Set<?> setTest = new HashSet<>();
	
	
	public static void main(String[] args) {
		
		Practice_num68 setTestmain = new Practice_num68();
		setTestmain.setTest.add(1); 
		
		
		Set set1 = Set.of(1, 2, 3);
		Set set2 = Set.of(2, 3, 4);
		
		System.out.println(numElementsInCommon(set1, set2));
		
	}

}
