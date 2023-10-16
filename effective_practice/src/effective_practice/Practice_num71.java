package effective_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_num71 {

	private int size; 
    private Object[] elements;
	
	public static void main(String[] args) {

		Practice_num71 practice = new Practice_num71();

		
        practice.size = 3;
        practice.elements = new Object[3];
        practice.elements[0] = "사과";
        practice.elements[1] = "바나나";
        practice.elements[2] = "체리";

        String[] array = practice.toArray(new String[2]);

        for (String item : array) {
            System.out.println(item);
        }
	
		
	}
	
	
	public <T> T[] toArray(T[] a) {
		
		
		if(a.length < size) {
			
			
			// 생성한 배열과 매개변수로 받은 배열의 타입이 모두 T[]로 같으므로
			// 올바른 형변환이다.
			@SuppressWarnings("unchecked") T[] result =
					(T[]) Arrays.copyOf(elements, size, a.getClass());
			return result;
			
		}
		
		System.arraycopy(elements, 0, a, 0, size);
		
		if(a.length > size) {
			a[size] = null;
		}
		
		return a;
		
	}

}
