package effective_practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Practice_num102 {

	public static void main(String[] args) throws Exception {

		 

		 int tests = 0;
	      int passed = 0;
	      Class<?> testClass = Class.forName(args[0]);
	      for (Method m : testClass.getDeclaredMethods()) {
	    	  if (m.isAnnotationPresent(ExceptionTest.class)) {
	    		   tests++;
	    		   try {
	    		      m.invoke(null);
	    		      System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
	    		   } catch (InvocationTargetException wrappedEx) {
	    		      Throwable exc = wrappedEx.getCause();
	    		      Class<? extends Throwable> excType =
	    		         m.getAnnotation(ExceptionTest.class).value();
	    		      if (excType.isInstance(exc)) {
	    		         passed++;
	    		      } else {
	    		         System.out.printf(
	    		               "테스트 %s 실패: 기대한 예외 %s, 발생한 예외 %s%n",
	    		                  m, excType.getName(), exc);
	    		      }
	    		   } catch (Exception exc) {
	    		      System.out.println("잘못 사용한 @ExceptionTest: " + m);
	    		   }
	    		}
	      }
	      System.out.printf("성공: %d, 실패: %d%n",
	               passed, tests - passed);
		
	}

}

class Sample2 {
	   @ExceptionTest(ArithmeticException.class)
	   public static void m1() { // 성공해야 한다.
	      int i = 0;
	      i = i / i;
	   }
	   
	   @ExceptionTest(ArithmeticException.class)
	   public static void m2() { // 실패해야 한다. (다른 예외 발생)
	      int[] a = new int[0];
	      int i = a[1];
	   }
	   
	   @ExceptionTest(ArithmeticException.class)
	   public static void m3() { } // 실패해야 한다. (예외가 발생하지 않음)
}