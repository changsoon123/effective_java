package effective_practice;

public class Practice_num63 {

	public void doSomething() {
        int outerValue = 10;

        class MyLocalClass {
            void display() {
                System.out.println("OuterValue: " + outerValue);
            }
        }

        MyLocalClass localClass = new MyLocalClass();
        localClass.display();
    }
	
	public static void main(String[] args) {

		
		Practice_num63 example = new Practice_num63();
        example.doSomething();
	}

}
