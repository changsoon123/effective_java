package effective_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice_num149 {

	static void boxingInCollection() {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            // 기본 타입 int가 Integer로 자동으로 박싱됨
            integerList.add(i);
        }

        System.out.println("List of Integers: " + integerList);
    }
	
	static void boxingInMap() {
        Map<String, Long> longMap = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            // 기본 타입 long이 Long으로 자동으로 박싱됨
            longMap.put("Key" + i, (long) i);
        }

        System.out.println("Map of Longs: " + longMap);
    }
	
	static <T> void genericMethod(T value) {
        System.out.println("Value: " + value);
    }
	
	static Integer getIntegerValue() {
        return 42; // 자동으로 박싱
    }
	
	public static void main(String[] args) {

		int result = getIntegerValue(); // 자동으로 언박싱
        System.out.println("Result: " + result);
//		
//		boxingInCollection();
//        boxingInMap();
//
//        genericMethod(42);
		
	}

}
