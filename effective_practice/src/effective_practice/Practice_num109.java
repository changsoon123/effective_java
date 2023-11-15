package effective_practice;

import java.util.HashMap;
import java.util.Map;

public class Practice_num109 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

        String key = "exampleKey";
        
        map.merge(key, 1, (count, incr) -> count + incr);
        map.merge(key, 2, (count, incr) -> count + incr);
        
        map.merge(key, 1, Integer::sum);

        
		
        
        
        System.out.println("Value for key '" + key + "': " + map.get(key));
		
	}

}

