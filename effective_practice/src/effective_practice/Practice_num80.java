package effective_practice;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Practice_num80 {

	public static void main(String[] args) {

		
		
	}

}

class Chooser {
	
	    private final Object[] choiceArray;

	    public Chooser(Collection<? extends T> choices) {
	    	
	    }
	    	
	    
	    public Chooser(final Object[] choiceArray) {
	        this.choiceArray = choiceArray;
	    }

	    public Object choose(){
	        Random random = ThreadLocalRandom.current();
	        return choiceArray[random.nextInt(choiceArray.length)];
	    }
	
}