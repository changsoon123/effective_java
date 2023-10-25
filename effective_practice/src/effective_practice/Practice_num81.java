package effective_practice;

import java.util.List;

public class Practice_num81 {

	
	
	public static <E> void swap(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
	
	
	private static <E> void swap2Helper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
	
	public static void swap2(List<?> list, int i, int j) {
		swap2Helper(list, i, j);
	};
	
	
	
	public static void main(String[] args) {

		
		
	}

}
