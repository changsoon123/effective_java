package effective_practice;

public class Practice_num110 {

	public static void main(String[] args) {

		Example exampleInstance = new Example();

		Runnable boundMethodReference = exampleInstance::instanceMethod;

		boundMethodReference.run();
		
		
	}

}

class Example {
    public void instanceMethod() {
        System.out.println("Instance method");
    }
}

