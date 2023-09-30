package effective_practice;

public class Practice_num39 {

	private int privateVar;

    private void privateMethod() {
    	
    	System.out.println(privateVar);
    }
	
	public static void main(String[] args) {

		Practice_num39 instance = new Practice_num39();
		instance.privateMethod();
		
	}

}

