package effective_practice;

import java.util.ArrayList;
import java.util.List;

public class Practice_num70 {

	public static void main(String[] args) {

		Animal2 animal = new Cat2();
		
		if (animal instanceof Cat2) {
		    System.out.println("This is a Cat");
		} else {
		    System.out.println("This is NOT a Cat");
		}
		
		
		List<Animal2> animals = new ArrayList<>();
		animals.add(new Cat2());

		if (animals instanceof List<Cat2>) {
		    System.out.println("This is a List of Cats");
		} else {
		    System.out.println("This is NOT a List of Cats");
		}
		
	}

}

class Animal2 { }

class Cat2 extends Animal2 { }