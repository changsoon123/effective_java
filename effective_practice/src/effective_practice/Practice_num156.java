package effective_practice;

public class Practice_num156 {
    
    // 어딘가에 정의된 SPEED_LIMIT 상수라고 가정합니다
    private static final int SPEED_LIMIT = 50;

    public static void main(String[] args) {
        // car가 Car 클래스의 인스턴스라고 가정합니다
        Car car = new Car();

        // car의 속도가 제한 속도의 2배를 초과하는지 확인합니다
        if (car.speed() > 2 * SPEED_LIMIT) {
            generateAudibleAlert("경찰 조심하세요!");
        }
    }

    // 어딘가에 정의된 이 메서드라고 가정합니다
    private static void generateAudibleAlert(String message) {
        // 소리 알림을 생성하는 구현 부분입니다
        System.out.println(message);
    }
}

// 어딘가에 정의된 Car 클래스라고 가정합니다
class Car {
    // 예제 메서드입니다. 실제 속도 구현으로 교체하세요
    public int speed() {
        // ...
        return 0;
    }
}