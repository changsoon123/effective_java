package effective_practice;

import java.util.Collection;
import java.util.Objects;

public class Practice_num78 {

	public static <E extends Comparable<E>> E max(Collection<E> c){
		if(c.isEmpty()) {
			throw new IllegalArgumentException("컬렉션이 비어 있습니다.");
		}
		
		E result = null;
		
		for(E e : c)
			if(result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);
		
		return result;
	};
	
	public static void main(String[] args) {

	}

}

interface Comparable<T>{
	int compareTo(T o);
}

