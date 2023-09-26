package effective_practice;

import java.util.ArrayList;
import java.util.List;

public class Practice_num31 {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {

		List<String> originalItems = new ArrayList<>();
		
        originalItems.add("Item 1");
        originalItems.add("Item 2");

        MyObject original = new MyObject(42, originalItems);
        
        MyObject cloned = (MyObject) original.clone();

        System.out.println("Original : " + original.getItems());
        System.out.println("Cloned : " + cloned.getItems());

        original.getItems().add("Item 3");

        System.out.println("Original : " + original.getItems());
        System.out.println("Cloned : " + cloned.getItems());
		
		
	}

}

class MyObject implements Cloneable {
    
	private int value;
    
	private List<String> items;
	
	public MyObject(int value, List<String> items) {
        this.value = value;
        this.items = items;
    }
	
	 public int getValue() {
		 
	        return value;
	    }
	 
	 public List<String> getItems() {
		 
	        return items;
	    }

    @Override
    public Object clone() throws CloneNotSupportedException {
    	
        MyObject cloned = (MyObject) super.clone();
        
        cloned.items = new ArrayList<>(items);
        
        return cloned;
    }
}