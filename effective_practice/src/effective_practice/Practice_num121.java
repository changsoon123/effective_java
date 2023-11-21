package effective_practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice_num121 {

	public static void main(String[] args) {

		Map<String, Long> freq = new HashMap<>();
		
		@SuppressWarnings("unused")
		List<String> topTen = freq.keySet().stream()
			    .sorted(Comparator.comparing(freq::get).reversed())
			    .limit(10)
			    .collect(Collectors.toList());
		
	}

}
