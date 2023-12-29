package effective_practice;

public class Practice_num162 {

	// IllegalArgumentException 예제
    public void performOperation(int repeatCount) {
        if (repeatCount < 0) {
            throw new IllegalArgumentException("반복 횟수는 음수일 수 없습니다.");
        }
        for (int i = 0; i < repeatCount; i++) {
            // 작업 수행
            System.out.println("작업을 반복합니다.");
        }
    }

    // IllegalStateException 예제
    public class InitializedObject {
        private boolean initialized = false;

        public void initialize() {
            // 객체 초기화 로직
            initialized = true;
            System.out.println("객체가 초기화되었습니다.");
        }

        public void performOperation() {
            if (!initialized) {
                throw new IllegalStateException("객체가 초기화되지 않았습니다.");
            }
            // 작업 수행
            System.out.println("작업을 수행합니다.");
        }
    }

    // UnsupportedOperationException 예제
    public interface CustomOperation {
        void perform();
    }

    public class SupportedOperation implements CustomOperation {
        @Override
        public void perform() {
            // 지원되는 동작 수행
            System.out.println("지원되는 동작을 수행합니다.");
        }
    }
    
    public class UnsupportedOperation implements CustomOperation {
        @Override
        public void perform() {
            // 지원되지 않는 동작 예외 던지기
            throw new UnsupportedOperationException("이 객체는 해당 동작을 지원하지 않습니다.");
        }
    }
	
	public static void main(String[] args) {

		Practice_num162 example = new Practice_num162();

        // IllegalArgumentException 발생 예제
        try {
            example.performOperation(-1); // 반복 횟수에 음수 전달
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // IllegalStateException 발생 예제
        InitializedObject initializedObject = example.new InitializedObject();
        try {
            initializedObject.performOperation(); // 초기화되지 않은 객체에서 작업 수행
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // UnsupportedOperationException 발생 예제
        CustomOperation supportedOperation = example.new SupportedOperation();
        CustomOperation unsupportedOperation = example.new UnsupportedOperation();

        supportedOperation.perform(); // 지원되는 동작 수행

        try {
            unsupportedOperation.perform(); // 지원되지 않는 동작 수행
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
		
	}

}
