package effective_practice;

public class Practice_num137 {

	static int sum(int... args) {
	    int sum = 0;
	    for (int arg : args) 
	        sum += arg;
	    return sum;
	}

	
	public static void main(String[] args) {

		System.out.println(sum(1, 2, 3));
		
	}

}
