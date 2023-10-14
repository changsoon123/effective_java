package effective_practice;

import java.util.List;

public class Practice_num69 {

	public static void main(String[] args) {

		Class stringClass = String.class; 
        System.out.println("Class name: " + stringClass.getName());
		
        Class rawListClass = List.class; 
        Class rawStringArrayClass = String[].class; 
        Class rawIntClass = int.class; 
        
        Class<List> listClass = List.class; // 에러
        Class<List> wildcardListClass = List.class; // 에러
	}

}
