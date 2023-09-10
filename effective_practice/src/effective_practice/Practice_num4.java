package effective_practice;

public class Practice_num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Singleton1 {
	private static final Singleton1 INSTANCE = new Singleton1(); // 정적 멤버로 인스턴스 생성

    private Singleton1() {
        // private 생성자
    }

    public static Singleton1 getInstance() {
        return INSTANCE; // 정적 팩토리 메서드를 통해 인스턴스 반환
    }
}