package effective_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Practice_num66 {

	private final Collection<Stamp> stamps;

	public Practice_num66() {
		stamps = new ArrayList<Stamp>();
		stamps.add((Stamp) new Coin(/*...*/));
	}
	
	public static void main(String[] args) {

		Practice_num66 test = new Practice_num66();
		
		System.out.println(test.stamps);	
		
		for(Iterator i = test.stamps.iterator(); i.hasNext();) {
			Stamp stamp = (Stamp) i.next();
			stamp.cancel();
		}
		
	}

}

class Coin {
	
}

class Stamp {

    

    public void cancel() {
       
    }

   
}
