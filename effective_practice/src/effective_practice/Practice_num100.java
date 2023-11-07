package effective_practice;

import java.lang.annotation.*;

public class Practice_num100 {

	public static void main(String[] args) {

		
		
	}

}

/**
 * 테스트 메서드임을 선언하는 애너테이션이다.
 * 매개변수 없는 정적 메서드 전용이다.
 */
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExceptionTest {
	Class<? extends Throwable> value();
}