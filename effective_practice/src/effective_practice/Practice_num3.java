package effective_practice;

import java.lang.reflect.Constructor;

public class Practice_num3 {

	public static void main(String[] args) {


		 Singleton instance1 = Singleton.getInstance();
	        Singleton instance2 = null;

	        try {
	            // 리플렉션을 사용하여 Singleton의 private 생성자에 접근
	            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
	            constructor.setAccessible(true);
	            instance2 = constructor.newInstance();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        System.out.println("instance1 hash code: " + instance1.hashCode());
	        System.out.println("instance2 hash code: " + instance2.hashCode());
		
	}

}

class Singleton {
    private static Singleton instance;

    Singleton() {
        // 기존 인스턴스가 있을 경우 다시 생성을 방지
        if (instance != null) {
            throw new IllegalStateException("이미 인스턴스가 존재합니다.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}