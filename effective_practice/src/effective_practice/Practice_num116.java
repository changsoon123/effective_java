package effective_practice;

@FunctionalInterface
interface MyFunctionalInterface1 {
    void myMethod();
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    void myMethod();
}

public class Practice_num116 {

	// 모호성이 발생하는 메서드
    static void myMethod(MyFunctionalInterface1 funcInterface) {
        System.out.println("Using MyFunctionalInterface1");
        funcInterface.myMethod();
    }

    static void myMethod(MyFunctionalInterface2 funcInterface) {
        System.out.println("Using MyFunctionalInterface2");
        funcInterface.myMethod();
    }
	
	public static void main(String[] args) {

         myMethod(() -> System.out.println("Calling myMethod"));
		
	}

}
