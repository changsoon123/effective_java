package effective_practice;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Practice_num141 {

	public static Optional<Integer> max20(Collection<Integer> c) {
	    return c.stream().max(Comparator.naturalOrder());
	}
	
	public static void main(String[] args) {

		Collection<Integer> numbers = List.of(1, 5, 3, 8, 2);
        Optional<Integer> maxResult = Practice_num141.max20(numbers);
        
        Integer lastWordInLexicon = maxResult.orElse(null);
        
        try {
            Integer preException = maxResult.orElseThrow(Exception::new);
            System.out.println("Value: " + preException);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        
        
        if (maxResult.isPresent()) {
            System.out.println("Max value: " + maxResult.get());
        } else {
            System.out.println("The collection is empty.");
        }
        
        if (lastWordInLexicon != null) {
            System.out.println("Max value: " + lastWordInLexicon);
        } else {
            System.out.println("The collection is empty.");
        }
        
        String result = maxResult.map(value -> "Transformed: " + value)
                .orElse("Default value");
        System.out.println(result);
        
        String transformedResult = maxResult.flatMap(value -> transform(value))
                .orElse("Default transformed value");
        System.out.println(transformedResult);
        
        Optional<Integer> number = Optional.of(42);

     Optional<String> mappedResult = number.map(value -> "Mapped: " + value);
     System.out.println(mappedResult);

     Optional<String> flatMappedResult = number.flatMap(value -> Optional.of("Mapped: " + value));
     System.out.println(flatMappedResult);
     
	}

	 private static Optional<String> transform(Integer value) {
	        if (value % 2 == 0) {
	            return Optional.of("Even: " + value);
	        } else {
	            return Optional.empty();
	        }
	    }
	
}
