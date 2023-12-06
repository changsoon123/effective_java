package effective_practice;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Practice_num140 {

//	public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
//	    if(c.isEmpty()) {
//	        return Optional.empty();
//	    }
//
//	    E result = null;
//	    for (E e : c) {
//	        if(result == null || e.compareTo(result) > 0) {
//	            result = Objects.requireNonNull(e);
//	        }
//	    }
//
//	    return Optional.of(result);
//	}

	
	public static <E extends Comparable<E>> Optional<E> max15(Collection<E> c) {
	        return c.stream().max(Comparator.naturalOrder());
	}
	
	public static void main(String[] args) {
	
		
		
		
	}
	
}
