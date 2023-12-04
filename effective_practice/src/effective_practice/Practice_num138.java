package effective_practice;

public class Practice_num138 {
	
	static int min(int firstArg, int... remainingArgs) {
	    int min = firstArg;
	    for (int arg : remainingArgs)
	        if (arg < min)
	            min = arg;
	    return min;
	}
	
	void foo() {}
	void foo(int a1) {}
	void foo(int a1, int a2) {}
	void foo(int a1, int a2, int a3) {}
	void foo(int a1, int a2, int a3, int... rest) {}

	public static void main(String[] args) {
	
		System.out.println(min(1, 2, 3));
		
	}
	
}
