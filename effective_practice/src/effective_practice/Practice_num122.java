package effective_practice;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_num122 {

	@SuppressWarnings("unused")
	private static final Map<String, Operation> stringToEnum =
			Stream.of(Operation.values()).collect(
					Collectors.toMap(Object::toString, e -> e));
	
	public static void main(String[] args) {

		
				
		
	}

}
