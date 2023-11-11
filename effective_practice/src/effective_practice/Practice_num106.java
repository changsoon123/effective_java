package effective_practice;

public class Practice_num106 {

	// 마커 인터페이스를 사용하는 메서드
    static void processWithMarkerInterface(MyMarkerInterface obj) {
        // 마커 인터페이스를 구현한 객체에 대한 작업 수행
    }

    // 마커 애너테이션을 사용하는 메서드
    @MyMarkerAnnotation
    static void processWithMarkerAnnotation() {
        // 마커 애너테이션을 사용한 작업 수행
    }

    // 마커 인터페이스를 구현한 클래스
    static class ClassImplementingMarkerInterface implements MyMarkerInterface {
        // 클래스의 내용
    }
	
	public static void main(String[] args) {

		// 마커 인터페이스를 구현한 객체 생성
        MyMarkerInterface markerInterfaceObj = new ClassImplementingMarkerInterface();

        // 마커 인터페이스를 사용하는 메서드 호출
        processWithMarkerInterface(markerInterfaceObj);

        // 마커 애너테이션을 사용하는 메서드 호출
        processWithMarkerAnnotation();
		
	}

}

//마커 인터페이스
interface MyMarkerInterface {
}

//마커 애너테이션
@interface MyMarkerAnnotation {
}