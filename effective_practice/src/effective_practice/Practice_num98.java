package effective_practice;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_num98 {

	public static void main(String[] args) {

		 Phase.Transition transition = Phase.Transition.from(Phase.SOLID, Phase.LIQUID);
	     System.out.println("고체에서 액체로 변화: " + transition);

	     transition = Phase.Transition.from(Phase.GAS, Phase.PLASMA);
	     System.out.println("가스에서 플라즈마로 변화: " + transition);

	     transition = Phase.Transition.from(Phase.LIQUID, Phase.SOLID);
	     System.out.println("액체에서 고체로 변화: " + transition);

	     transition = Phase.Transition.from(Phase.PLASMA, Phase.GAS);
	     System.out.println("플라즈마에서 가스로 변화: " + transition);
		
	}

}

enum Phase {
	   SOLID, LIQUID, GAS, PLASMA;
	   
	   public enum Transition {
	      MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
	      BOILD(LIQUID, GAS), CONDENSE(GAS, LIQUID),
	      SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID),
	      IONIZE(GAS, PLASMA), DEIONIZE(PLASMA, GAS);
	      
	      private final Phase from;
	      private final Phase to;
	      
	      Transition(Phase from, Phase to) {
	         this.from = from;
	         this.to = to;
	      }
	      
	      // 상전이 맵을 초기화한다.
	      private static final Map<Phase, Map<Phase, Transition>>
	         m = Stream.of(values()).collect(Collectors.groupingBy(t -> t.from,
	            () -> new EnumMap<>(Phase.class),
	            Collectors.toMap(t -> t.to, t -> t, 
	               (x, y) -> y, () -> new EnumMap<>(Phase.class))));
	               
	      public static Transition from(Phase from, Phase to) {
	         return m.get(from).get(to);
	      }
	   }
	}