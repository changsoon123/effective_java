package effective_practice;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



public class Practice_num97 {

	private static Plant[] garden;

	
	public static void main(String[] args) {
		
		   garden = new Plant[3];

		   garden[0] = new Plant("Rose", Plant.LifeCycle.PERENNIAL);
		   garden[1] = new Plant("Sunflower", Plant.LifeCycle.ANNUAL);
		   garden[2] = new Plant("Lavender", Plant.LifeCycle.PERENNIAL);
		   
//		   Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle =
//				   new EnumMap<>(Plant.LifeCycle.class);
//				   
//				for (Plant.LifeCycle lc : Plant.LifeCycle.values())
//				   plantsByLifeCycle.put(lc, new HashSet<>());
//
//				for (Plant p : garden)
//				   plantsByLifeCycle.get(p.lifeCycle).add(p);
//		
//				System.out.println(plantsByLifeCycle);

		   
		            System.out.println(Arrays.stream(garden)
			                  .collect(Collectors.groupingBy(p -> p.lifeCycle,
			                		  () -> new EnumMap<>(Plant.LifeCycle.class), Collectors.toSet())));
			                		  

		            
	}

	

	

	

}

class Plant {
	   enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }
	   
	   final String name;
	   final LifeCycle lifeCycle;
	   
	   Plant(String name, LifeCycle lifeCycle) {
	      this.name = name;
	      this.lifeCycle = lifeCycle;
	   }
	   
	   @Override
	   public String toString() {
	      return name;
	   }
	   
	  
	}