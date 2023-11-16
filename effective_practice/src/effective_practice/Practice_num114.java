package effective_practice;

import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.LongToIntFunction;
import java.util.function.ToIntFunction;

public class Practice_num114 {

	public static void main(String[] args) {

        UnaryOperator<String> toUpperCase = str -> str.toUpperCase();

        String result = toUpperCase.apply("hello");
        System.out.println(result);
	
        BinaryOperator<Integer> add = (a, b) -> a + b;

        int result2 = add.apply(3, 5);
        System.out.println(result2); // 출력: 8
        
        ToIntFunction<String> stringLength = str -> str.length();

        // 결과로 int를 반환
        int length = stringLength.applyAsInt("Hello");
        System.out.println("Length: " + length);
        
        LongToIntFunction square = value -> (int) (value * value);

        int result3 = square.applyAsInt(5L);
        System.out.println("Square: " + result3);
        
        
        BooleanSupplier isEven = () -> {
            int number = 10;
            return number % 2 == 0;
        };

        boolean result4 = isEven.getAsBoolean();
        System.out.println("Is it even? " + result4);
	}

}

@FunctionalInterface
interface UnaryOperator<T> extends Function<T, T> {

}

@FunctionalInterface
interface BinaryOperator<T> extends BiFunction<T, T, T> {

}