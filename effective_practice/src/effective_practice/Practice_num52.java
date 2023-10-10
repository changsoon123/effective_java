package effective_practice;

interface MyInterface2 {
    default void myMethod() {
        System.out.println("Default");
    }
    
    default void newMethod() {
        System.out.println("New default");
    }
}

class MyClass implements MyInterface2 {
	
}

public class Practice_num52 {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		
        obj.myMethod(); 
        obj.newMethod();
    }
		
}

