package effective_practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Practice_num103 {

	public static void main(String[] args) throws Exception {

		 int tests = 0;
	      int passed = 0;
	      Class<?> testClass = Class.forName(args[0]);
	      for (Method m : testClass.getDeclaredMethods()) {
	    	  if (m.isAnnotationPresent(ExceptionTest3.class) ||
	    			  m.isAnnotationPresent(ExceptionTestContainer.class) ) {
	    		   tests++;
	    		   try {
	    		      m.invoke(null);
	    		      System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
	    		   } catch (Throwable wrappedEx) {
	    		      Throwable exc = wrappedEx.getCause();
	    		      
	    		      int oldPassed = passed;
	    		      ExceptionTest3[] excTests =
	    		    		  m.getAnnotationsByType(ExceptionTest3.class);
	    		      
	    		      for(ExceptionTest3 excTest : excTests) {
	    		    	  if (excTest.value().isInstance(exc)) {
	 	    		         passed++;
	 	    		         break;
	 	    		      	}
	    		    	  
	    		      	}
	    		      if(passed == oldPassed)
	    		    	  System.out.printf("테스트 %s 실패 : %s %n", m, exc);
	    		      
	    		   }
	    	  }
	      }
	}

	@ExceptionTest2({ IndexOutOfBoundsException.class, NullPointerException.class })
	public static void doublyBad() {
	   List<String> list = new ArrayList<>();
	   
	   // 자바 API 명세에 따르면 다음 메서드는 위의 2개를 던질 수 있다.
	   list.addAll(5, null);
	}
	
	@ExceptionTest3(NullPointerException.class)
	@ExceptionTest3(IndexOutOfBoundsException.class)
	public static void doublyBad2() {
	   List<String> list = new ArrayList<>();
	   
	   // 자바 API 명세에 따르면 다음 메서드는 위의 2개를 던질 수 있다.
	   list.addAll(5, null);
	}
	
	
	
}
