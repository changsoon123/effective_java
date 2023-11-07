package effective_practice;

import java.lang.reflect.*;

public class Practice_num101 {

	
	public static void main(String[] args) throws Exception {

		      int tests = 0;
		      int passed = 0;
		      Class<?> testClass = Class.forName(args[0]);
		      for (Method m : testClass.getDeclaredMethods()) {
		         if ( m.isAnnotationPresent(Test.class)) {
		            tests++;
		            try {
		               m.invoke(null);
		               passed++;
		            } catch (InvocationTargetException wrappedExc) {
		               Throwable exc = wrappedExc.getCause();
		               System.out.println(m + " 실패: " + exc);
		            } catch (Exception exc) {
		               System.out.println("잘못 사용한 @Test: " + m);
		            }
		         }
		      }
		      System.out.printf("성공: %d, 실패: %d%n",
		               passed, tests - passed);
		   
	}

}

class Sample {
	   @Test
	   public static void m1() { } // 성공해야 한다.
	   public static void m2() { }
	   @Test
	   public static void m3() { // 실패해야 한다.
	      throw new RuntimeException("실패");
	   }
	   
	   public static void m4() { }
	   @Test public void m5() { } // 잘못 사용한 예 : 정적 메서드가 아니다.
	   public static void m6() { }
	   @Test
	   public static void m7() { // 실패해야 한다.
	      throw new RuntimeException("실패");
	   }
	   
	   public static void m8() { }
}


