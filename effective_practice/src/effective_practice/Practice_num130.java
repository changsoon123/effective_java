package effective_practice;

import java.math.BigInteger;
import java.util.Objects;

public class Practice_num130 {

	/**
	* (현재 값 mod m) 값을 반환한다. 이 메서드는 
	* 항상 음이 아닌 BigInteger를 반환한다는 점에서 remainder 메서드와 다르다.
	*
	* @param m 계수 (앵수여야 한다.)
	* @return 현재 값 mod m
	* @throws ArithmeticException m이 0보다 작거나 같으면 발생한다.
	*/
	public BigInteger mod(BigInteger m) {
	    if (m.signum() <= 0)
	        throw new ArithmeticException("계수(m)는 양수여야 합니다. " + m);
		return m;
	}
	
	private static Object strategy ;
	
	static {
		strategy = Objects.requireNonNull(strategy, "전략");	
	
	}
	
	private static void sort(long[] a, int offset, int length) {
	    assert a != null;
	    assert offset >= 0 && offset <= a.length;
	    assert length >= 0 && length <= a.length - offset;
	}
	
	public static void main(String[] args) {

		
		
	}

}

