package effective_practice;

import java.util.function.Supplier;

public class Practice_num112 {

	public static void main(String[] args) {

//        Supplier<MyClass2> constructorReference = MyClass2::new;
//
//        MyClass2 instance = constructorReference.get();
		
        
        ArrayCreator arrayCreator = int[]::new;

        int[] newArray = arrayCreator.createArray(5);
        System.out.println("Array length: " + newArray.length);
	}

}

interface ArrayCreator {
    int[] createArray(int length);
}

class MyClass2 {
    public MyClass2() {
        System.out.println("MyClass 인스턴스 생성!");
    }
}