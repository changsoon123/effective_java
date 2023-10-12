package effective_practice;

public class Practice_num58 {

	private static class PrivateStaticClass {
        // 정적 멤버 클래스 내용
    }

    public void someMethod() {
    	
        PrivateStaticClass inner = new PrivateStaticClass();
        
    }
	
	public static void main(String[] args) {

		
	}
	
}

class AnotherClass {
    
	public void anotherMethod() {
		
         PrivateStaticClass inner = new PrivateStaticClass(); // 컴파일 오류

    }
}
