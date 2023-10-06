package effective_practice;


import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

public class Practice_num50 {

	public static void main(String[] args) {

		
		
	}

}

interface MyCollection<E> extends Iterable<E> {

    default boolean removeIf(Predicate<? super E> filter) {
    	
        Objects.requireNonNull(filter);
        
        boolean removed = false;
        
        Iterator<E> each = iterator();
        
        while (each.hasNext()) {
        	
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
            
        }
        
        return removed;
    }

    // 다른 메서드 정의
}

