package effective_practice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Practice_num111 {

    public static void main(String[] args) {

    	BiConsumer<Example10, Example10> unboundMethodReference = (e1, e2) -> Example10.staticMethod2(e2);
    	
    	
    	unboundMethodReference.accept(null,new Example10());

    }
}

class Example10 {
    public static void staticMethod2(Example10 instance) {
        System.out.println("Static method");
    }
}