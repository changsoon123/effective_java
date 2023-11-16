package effective_practice;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice_num113<K, V> extends LinkedHashMap<K, V> implements Serializable {

		private static final long serialVersionUID = 1L;
	
	 	private static final int MAX_ENTRIES = 100;
	
	    public Practice_num113() {
	        // 초기 용량, 로드 팩터, 순서 유지 여부 지정
	        super(MAX_ENTRIES, 0.75f, true);
	    }
	    
	 // removeEldestEntry 메서드를 재정의하여 가장 오래된 엔트리를 제거하는 로직을 추가
	    @Override
	    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
	        return size() > MAX_ENTRIES;
	    }
	 
	public static void main(String[] args) {

		Practice_num113<Integer, String> cache = new Practice_num113<>();

        for (int i = 1; i <= 150; i++) {
            cache.put(i, "Value " + i);
        }

        System.out.println("Cache size: " + cache.size());

        System.out.println("Value for key 50: " + cache.get(50));
        System.out.println("Value for key 50: " + cache.get(60));
        System.out.println("Value for key 70: " + cache.get(70));
        System.out.println("Value for key 101: " + cache.get(101));
		
	}

}

@FunctionalInterface interface EldestEntryRemovalFunction<K, V> {
    boolean remove(Map<K,V> map, Map.Entry<K, V> eldest);
}
