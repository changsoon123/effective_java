package effective_practice;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Practice_num128 {

	static Stream<BigInteger> primes() {
		   return Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
	}
	
	public static void main(String[] args) {

		primes().map(p -> BigInteger.TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
        .filter(mersenne -> mersenne.isProbablePrime(50))
        .limit(20)
        .forEach(System.out::println);
		
	}

}


	