package effective_practice;

import java.util.ArrayList;
import java.util.List;

public class Practice_num72 {

	public static void main(String[] args) {

//		Object[] objectArray = new Long[1];
//		objectArray[0] = "타입이 달라 넣을 수 없다.";
//		
//		System.out.println(objectArray);
//		
//		ArrayList<Long> longList = new ArrayList<>(3);
//		longList = "타입이 달라 넣을 수 없다.";
//		
//		System.out.println(longList);
		
		
//		List[] stringLists = new List[1]; // (1) 
//		List intList = List.of(42);              // (2)
//		
//		Object[] objects = stringLists;                   // (3)
//		objects[0] = intList;                             // (4)
//		
//		String s = String.valueOf(stringLists[0].get(0));    //// (5)
//		
//		System.out.println(s);

		List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        String[] stringArray = integerList.toArray(new String[0]);
		
		
	}
	
//	public void myMethod(String... args) {
//	    
//	}

}
