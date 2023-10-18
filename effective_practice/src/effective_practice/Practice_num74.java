package effective_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Practice_num74<T> {

	private final List<T> choiceList;
	

	public Practice_num74(Collection<T> choices) {
		choiceList = new ArrayList<>(choices);
	}
	
	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceList.get(rnd.nextInt(choiceList.size()));
	}
	
	
	
	public static void main(String[] args) {

		
		
	}

}
