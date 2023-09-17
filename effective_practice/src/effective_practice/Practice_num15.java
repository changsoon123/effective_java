package effective_practice;


import java.util.LinkedHashMap;
import java.util.Map;

public class Practice_num15 {

	public static void main(String[] args) {

		int maxSize = 3;
		
        Map<String, Integer> cache = new LinkedHashMap<String, Integer>(maxSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > maxSize;
            }
        };

        // 맵에 데이터 추가
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        cache.put("D", 4);

        // 맵 조회
        System.out.println(cache); // 출력: {B=2, C=3, D=4}
		
		
	}

}
