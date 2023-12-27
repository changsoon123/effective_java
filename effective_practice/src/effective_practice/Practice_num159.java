package effective_practice;

public class Practice_num159 {

	 // 런타임 예외(RuntimeException)을 던지는 메서드
    public static void throwRuntimeException() {
        throw new RuntimeException("런타임 예외가 발생했습니다.");
    }

    // 에러(Error)를 던지는 메서드
    public static void throwError() {
        throw new Error("에러가 발생했습니다.");
    }
	
	public static void main(String[] args) {

		try {
            // 런타임 예외를 던지는 메서드 호출
            throwRuntimeException();
        } catch (RuntimeException e) {
            // 런타임 예외는 보통 잡지 않아도 되지만, 필요한 경우 처리할 수 있음
            System.out.println("런타임 예외를 처리했습니다: " + e.getMessage());
        }

        try {
            // 에러를 던지는 메서드 호출
            throwError();
        } catch (Error error) {
            // 에러는 보통 잡지 않아도 되지만, 필요한 경우 처리할 수 있음
            System.out.println("에러를 처리했습니다: " + error.getMessage());
        }

        // 비검사 throwable을 잡지 않은 스레드는 중단될 수 있음
        // (에러는 일반적으로 처리하지 않는 것이 좋음)
		
	}

}
