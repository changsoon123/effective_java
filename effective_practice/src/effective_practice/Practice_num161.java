package effective_practice;


class YourObject {
    // 예제를 이해하기 위해 더미 메서드 작성
    public void action(String[] args) throws TheCheckedException {
        // 예외를 던지는 코드
    }

    public boolean actionPermitted(String[] args) {
        // 허용 여부를 확인하는 로직
        return true; // 더미 반환값
    }
}

public class Practice_num161 {

	public static void main(String[] args) {

		YourObject obj = new YourObject();

		obj.action(args);
		
        try {
            obj.action(args);
        } catch (TheCheckedException e) {
            // 예외 상황에 대처한다.
        }

        if (obj.actionPermitted(args)) {
            obj.action(args);
        } else {
            // 예외 상황에 대처한다.
        }
	}

}
