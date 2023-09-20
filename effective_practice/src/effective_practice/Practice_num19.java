package effective_practice;

public class Practice_num19 {

	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = obj1;
		boolean result = obj1.equals(obj2); // true
		
		String str1 = "Hello";
		String str2 = "Hello";
		boolean result2 = str1.equals(str2); // true
		
		System.out.println(result);
		System.out.println(result2);

	}

}
