package effective_practice;

import java.lang.ref.Cleaner;

public class Practice_num16 implements AutoCloseable {

	private static final Cleaner cleaner = Cleaner.create();

    // 청소 작업을 수행할 객체
    private static class State implements Runnable {
        int numJunkPiles; // 방 안의 쓰레기 수

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        // clean 메서드가 호출될 때 수행될 작업
        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkPiles = 0;
        }
    }

    private final State state;

    private final Cleaner.Cleanable cleanable;

    public Practice_num16(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        cleanable.clean();
    }
	
	public static void main(String[] args) {

		try (Practice_num16 room = new Practice_num16(7)) {
            System.out.println("Room is now closed.");
        }
		
	}

}
