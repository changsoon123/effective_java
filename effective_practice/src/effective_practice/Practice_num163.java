package effective_practice;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Practice_num163<E> {

	// LowerLevelException 클래스 정의
	static class LowerLevelException extends Exception {
	    // 필요한 내용 추가
	}

	// HigherLevelException 클래스 정의
	static class HigherLevelException extends Exception {
		
		public HigherLevelException(String message, Throwable cause) {
	        super(message, cause);
	    }
		
	}
	
	static class HigherLevelException2 extends Exception {
		   HigherLevelException2(Throwable cause) {
		      super(cause);
		   }
		}
	
	/**
	 * 이 리스트 안의 지정한 위치의 원소를 반환한다.
	 * @throws IndexOutOfBoundsException index가 범위 밖이라면,
	 * 즉 ({@code index < 0 || index >= size()})이면 발생한다.
	*/
	public E get(int index) {
	   ListIterator<E> i = listIterator(index);
	   try {
	      return i.next();
	   } catch (NoSuchElementException e) {
	      throw new IndexOutOfBoundsException("인덱스: " + index);
	   }
	}
	
	private ListIterator<E> listIterator(int index) {

		return null;
	}

	public static void main(String[] args) throws HigherLevelException {

		try {
			throw new LowerLevelException(); // 저수준 추상화를 이용한다.
			} catch (LowerLevelException e) {
			   // 추상화 수준에 맞게 번역한다.
			   throw new HigherLevelException("고수준 추상화를 이용한다", e);
			}
		
	}

}
