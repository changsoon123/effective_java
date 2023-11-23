package effective_practice;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Practice_num125 {

	static Stream<ProcessHandle> allProcesses() {
		return null;
	}
	
	public static <E> Iterable<E> iterableOf(Stream<E> stream){
		return stream::iterator;
	}
	
	public static <E> Stream<E> streamOf(Iterable<E> iterable){
		return StreamSupport.stream(iterable.spliterator(), false);
	}
	
	public static void main(String[] args) {

		for(ProcessHandle p : iterableOf(ProcessHandle.allProcesses())) {
			
		}
		
		
//		for(ProcessHandle ph : (Iterable<ProcessHandle>)
//				ProcessHandle.allProcesses()::iterator) {
//
//        }
//		
		
	}

}
