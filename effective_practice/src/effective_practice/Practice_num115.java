package effective_practice;

public class Practice_num115 {

	public static void main(String[] args) {

		MyFunctionalInterface10 myInterface = () -> System.out.println("Abstract method");

        myInterface.myAbstractMethod();

        myInterface.myDefaultMethod();

        MyFunctionalInterface10.myStaticMethod();
		
	}

}

@FunctionalInterface
interface MyFunctionalInterface10 {
	
    void myAbstractMethod();

    default void myDefaultMethod() {
        System.out.println("Default method");
    }

    static void myStaticMethod() {
        System.out.println("Static method");
    }
}