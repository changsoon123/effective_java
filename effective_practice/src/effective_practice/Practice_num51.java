package effective_practice;

import java.util.Collection;

interface I1 {
    default void someMethod() {
        System.out.println("I1 !!");
    }
}

interface I2 {
    default void someMethod() {
        System.out.println("I2 !!");
    }
}

public class Practice_num51 implements I1, I2 {

	@Override
    public void someMethod()  {
		
        System.out.println("Practice_num51 class");
    }
		  
	public static void main(String[] args) {

			  Practice_num51 myObj = new Practice_num51();
			  
			
		        myObj.someMethod();
			  
	}

}
