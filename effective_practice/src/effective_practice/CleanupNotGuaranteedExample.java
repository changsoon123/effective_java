package effective_practice;



import java.lang.ref.Cleaner;

public class CleanupNotGuaranteedExample {
    private static final Cleaner cleaner = Cleaner.create();

    private static class State implements Runnable {
        @Override
        public void run() {
            System.out.println("Cleaning room");
        }
    }

    private final State state;
    private final Cleaner.Cleanable cleanable;

    public CleanupNotGuaranteedExample() {
        state = new State();
        cleanable = cleaner.register(this, state);
    }

    public static void main(String[] args) {
        CleanupNotGuaranteedExample example = new CleanupNotGuaranteedExample();

        // 객체를 사용한 후 바로 null로 만듭니다.
        example = null;

        // Garbage Collection을 강제로 수행합니다.
        System.gc();

        // 일정 시간 대기
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("테스트 진행");
    }
}