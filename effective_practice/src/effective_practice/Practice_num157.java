package effective_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Practice_num157 {

	static class Mountain {
        public void climb() {
        	
        }
    }
	
	static class Foo {
        	
    }
	
	public static void main(String[] args) {
		
		List<Foo> collection = new ArrayList<>();
        collection.add(new Foo());
        collection.add(new Foo());
		
		for (Iterator<Foo> i = collection.iterator(); i.hasNext(); ) {
		    Foo foo = i.next();
		    System.out.println(foo);
		}
		
		try {
		    Iterator<Foo> i = collection.iterator();
		    while (true) {
		        Foo foo = i.next();
		        System.out.println(foo);
		    }
		} catch (NoSuchElementException e) {
			
		}
		

		Mountain[] range = new Mountain[10];
		
		try {
			  int i = 0;

			  while(true) {
			    range[i++].climb();
			  }
			} catch (ArrayIndexOutOfBoundsException e) {

			}
		
		try {

			  for (Mountain m : range)
				  m.climb();
			  
			} catch (ArrayIndexOutOfBoundsException e) {

			}
		
	}

}
