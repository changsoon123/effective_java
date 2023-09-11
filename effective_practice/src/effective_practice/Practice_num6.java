package effective_practice;

public class Practice_num6 {

	public static void main(String[] args) {


		
		
	}

}

class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();

    // private 생성자로 외부에서 객체 생성을 막음
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}