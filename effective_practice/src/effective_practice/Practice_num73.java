package effective_practice;

import java.util.List;

public class Practice_num73 {

	@SafeVarargs
    static <T> void printList(T... list) {
        for (T item : list) {
            System.out.println(item);
        }
	}
	
	public static void main(String[] args) {

		 List<String> stringList = List.of("One", "Two", "Three");
	        printList(stringList);
		
	}

}
