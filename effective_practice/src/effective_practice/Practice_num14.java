package effective_practice;

import java.util.Map;
import java.util.WeakHashMap;

public class Practice_num14 {

	public static void main(String[] args) {

		// WeakHashMap을 사용한 캐시 생성
        Map<Key, Value> cache = new WeakHashMap<>();

        // 캐시에 데이터 추가
        Key key1 = new Key("key1");
        Value value1 = new Value("value1");
        cache.put(key1, value1);

        Key key2 = new Key("key2");
        Value value2 = new Value("value2");
        cache.put(key2, value2);

        // 캐시에서 데이터 조회
        System.out.println("key1에 대한 값: " + cache.get(key1));
        System.out.println("key2에 대한 값: " + cache.get(key2));

        // key1에 대한 참조를 제거 (더 이상 참조되지 않음)
        key1 = null;

        // 가비지 컬렉션을 수행하여 key1과 관련된 엔트리를 제거
        System.gc();

        // 캐시에서 데이터 조회 (key1에 대한 값은 이미 제거됨)
        System.out.println("key1에 대한 값: " + cache.get(key1));
        System.out.println("key2에 대한 값: " + cache.get(key2));
    }

	static class Key {
		
	    private String key;

	    Key(String key) {
	        this.key = key;
	    }
	}

	static class Value {
	    private String value;

	    Value(String value) {
	        this.value = value;
	    }
	}

}
