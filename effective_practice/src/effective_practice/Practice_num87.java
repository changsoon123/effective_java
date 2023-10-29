package effective_practice;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class Practice_num87 {

	public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
		
		return someElement.getAnnotation(annotationType);
	};
	
	static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
		  Class<?> annotationType = null; // 비 한정적 타입 토큰
		  try {
		    annotationType = Class.forName(annotationTypeName);
		  } catch (Exception ex) {
		    throw new IllegalArgumentException(ex);
		  }

		  return element.getAnnotation(annotationType.asSubclass(Annotation.class));
		}
	
	public static void main(String[] args) {

		
		
	}

}
