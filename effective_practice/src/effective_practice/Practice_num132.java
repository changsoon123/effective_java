package effective_practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice_num132 {

	public static void processMap(Map<String, Integer> data) {
 
	}
	
	 static class MyCustomMap<K, V> implements Map<K, V> {

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsKey(Object key) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsValue(Object value) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public V get(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public V put(K key, V value) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public V remove(Object key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void putAll(Map<? extends K, ? extends V> m) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Set<K> keySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<V> values() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<Entry<K, V>> entrySet() {
			// TODO Auto-generated method stub
			return null;
		}
		 
		 
	    }
	
	public static void main(String[] args) {

        MyCustomMap<String, Integer> customMapData = new MyCustomMap<>();

        HashMap<String, Integer> hashMapData = new HashMap<>();

        processMap(customMapData);
        processMap(hashMapData);
		
	}

}
