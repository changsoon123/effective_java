package effective_practice;

import java.util.stream.LongStream;
import java.math.BigInteger;

public class Practice_num129 {

	static long pi(long n) {
		   return LongStream.rangeClosed(2, n)
			  .parallel()
		      .mapToObj(BigInteger::valueOf)
		      .filter(i -> i.isProbablePrime(50))
		      .count();
		}
	
	public static void main(String[] args) {

		System.out.println(pi(100));
	}

}
