package effective_practice;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Practice_num84 {

	static <T> List<T> pickTwo(T a, T b, T c){
	    switch (ThreadLocalRandom.current().nextInt(3)){
	        case 0: return List.of(a,b);
	        case 1: return List.of(b,c);
	        case 2: return List.of(a,c);
	    }
	    throw new AssertionError(); // 도달 못함.
	}
	
	static <T> T[] toArray(T... args){
	    return args;
	}

	public static void main(String[] args) {

		List<String> attributes = pickTwo("좋은", "빠른", "저렴한");
		System.out.println(attributes);
	}

}

