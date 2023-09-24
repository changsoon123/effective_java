package effective_practice;

import java.net.URL;

public class Practice_num24 {

	public static void main(String[] args) throws Exception {

		URL url1 = new URL("https://www.example.com");
        URL url2 = new URL("https://www.example.com");

        boolean isEqual = url1.equals(url2);

        System.out.println(isEqual);
	
        Object obj1 = new Object();
        Object obj2 = obj1; // 같은 메모리를 참조

        boolean isEqual2 = obj1.equals(obj2);

        System.out.println(isEqual2);
        
	}

}

