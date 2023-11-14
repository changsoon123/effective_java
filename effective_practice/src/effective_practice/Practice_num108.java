package effective_practice;

public class Practice_num108 {

	public static void main(String[] args) {

//        MyFunctionalInterface myLambda = () -> System.out.println("Hello Lambda!");
//        myLambda.myMethod();
		
//        MyAbstractClass myAnonymousClass = new MyAbstractClass() {
//            @Override
//            void myMethod() {
//                System.out.println("Hello Anonymous Class!");
//            }
//        };
//        
//        myAnonymousClass.myMethod();
        
        LambdaVsAnonymousClass example = new LambdaVsAnonymousClass();
        example.lambdaExample();
        example.anonymousClassExample();
	}

}

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
//    void myMethod2();
}

abstract class MyAbstractClass {
    abstract void myMethod();
//    abstract void anotherAbstractMethod();
}

class LambdaVsAnonymousClass {
    private String outerField = "Outer field";

    public void lambdaExample() {
        String localVariable = "Local variable";

        // 람다 표현식
        MyFunctionalInterface myLambda = () -> {
            // 여기서의 this는 LambdaVsAnonymousClass의 인스턴스를 가리킴
            System.out.println(this.outerField); // "Outer field"
            // 람다 내부에서의 로컬 변수 참조
            System.out.println(localVariable); // "Local variable"
        };

        myLambda.myMethod();
    }

    public void anonymousClassExample() {
        String localVariable = "Local variable";

        // 익명 클래스
        MyFunctionalInterface myAnonymousClass = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
            	
                // 여기서의 this는 익명 클래스의 인스턴스를 가리킴
                System.out.println(LambdaVsAnonymousClass.this.outerField); // 인스턴스 식별자 출력
                // 익명 클래스 내부에서의 로컬 변수 참조
                System.out.println(localVariable); // "Local variable"
            }
        };

        myAnonymousClass.myMethod();
    }
    
}
