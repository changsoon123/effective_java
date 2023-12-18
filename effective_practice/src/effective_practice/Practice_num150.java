package effective_practice;

import java.util.Iterator;

public class Practice_num150 {

	public static void main(String[] args) {
		
		 String className = ""; 

	        Iterator<String> iterator = someIteratorMethod();

	        for (int i = 0; i < Integer.MAX_VALUE && iterator.hasNext(); i++) {
	            String compoundKey = className + "#" + iterator.next();
	            System.out.println(compoundKey);
	        }
	}

	private static Iterator<String> someIteratorMethod() {
		
		return null;
	}

}

//class ThreadLocal {
//    private ThreadLocal() { } // 객체 생성 불가
//
//    // 현재 스레드의 값을 키로 구분해 저장한다.
//    public static void set(String key, Object value) {
//	}
//
//    // 키가 가리키는 현재 스레드의 값을 반환한다.
//    public static Object get(String key) {
//		return null;
//	}
//}

//class ThreadLocal {
//    private ThreadLocal() { } // 객체 생성 불가
//
//    public static class Key { // 권한
//        Key() { }
//    }
//
//    // 위조 불가능한 고유 키를 생성한다.
//    public static Key getKey() {
//        return new Key();
//    }
//
//    public static void set(Key key, Object value) {
//	}
//    public static Object get(Key key) {
//		return null;
//	}
//}

//final class ThreadLocal {
//    public ThreadLocal() {
//	}
//    public void set(Object value) {
//	}
//    public Object get() {
//		return null;
//	}
//}

final class ThreadLocal<T> {
    public ThreadLocal() {
	}
    public void set(T value) {
	}
    public T get() {
		return null;
	}
}
