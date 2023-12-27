package effective_practice;

import java.io.IOException;

public class Practice_num158 {

	// 검사 예외를 던질 수 있는 메서드
    public static void someMethod() throws IOException {
    	
        // 예외가 발생할 조건을 시뮬레이션
        boolean errorCondition = true;

        if (errorCondition) {
            // IOException 던짐
            throw new IOException("예외가 발생했습니다.");
        } else {
            // 예외가 발생하지 않으면 정상 동작 수행
            System.out.println("메서드가 정상적으로 실행되었습니다.");
        }
    }
	
	public static void main(String[] args) {

		try {
            // someMethod 호출 시 예외 처리
            someMethod();
        } catch (IOException e) {
            // IOException을 catch하여 처리하거나, 더 상위 호출자로 전파할 수 있음
            System.out.println("검사 예외를 처리했습니다: " + e.getMessage());
        }
		
	}

}
