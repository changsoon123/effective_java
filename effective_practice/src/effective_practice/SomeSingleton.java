package effective_practice;

import java.util.function.Supplier;

public class SomeSingleton {

	private static final SomeSingleton INSTANCE = new SomeSingleton();

    private SomeSingleton() {
        // private 생성자
    }

    public static SomeSingleton getInstance() {
        return INSTANCE;
    }
	
	
	public static void main(String[] args) {

		SingletonFactory<SomeSingleton> factory = SingletonFactory.create(SomeSingleton::getInstance);
		
		
        SomeSingleton singleton = factory.getInstance();
		
		
	}

}

class SingletonFactory<T> {
	
    private final Supplier<T> supplier;

    private SingletonFactory(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T getInstance() {
        return supplier.get();
    }

    public static <T> SingletonFactory<T> create(Supplier<T> supplier) {
        return new SingletonFactory<>(supplier);
    }
    
}