package effective_practice;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toMap;

public class Practice_num90 {

	public enum Operation {
		   PLUS, MINUS, TIMES, DIVIDE;
		   
		   // 상수가 뜻하는 연산을 수행한다.
		   public double apply(double x, double y) {
		      switch(this) {
		         case PLUS: return x + y;
		         case MINUS: return x - y;
		         case TIMES: return x * y;
		         case DIVIDE: return x / y;
		      }
		      throw new AssertionError("알 수 없는 연산: " + this);
		   }
		}
	
	public enum Operation2 {
		   PLUS2("+") {
			   {
		            Operation2 operation = MINUS2; 
		        }
			   
		      public double apply(double x, double y) { return x+y; }
		   },
		   MINUS2("-") {
		      public double apply(double x, double y) { return x-y; }
		   },
		   TIMES2("*") {
		      public double apply(double x, double y) { return x*y; }
		   },
		   DIVIDE2("/") {
		      public double apply(double x, double y) { return x/y; }
		   };
		   
		   private final String symbol;
		   
		   Operation2(String symbol) { this.symbol = symbol; }
		   
		   @Override
		   public String toString() { return symbol; }
		   
		   public abstract double apply(double x, double y);
		   
		   private static final Map<String, Operation2> stringToEnum = 
				         Stream.of(values()).collect(
				         toMap(Object::toString, e -> e));

				// 지정한 문자열에 해당하는 Operation을 (존재한다면) 반환한다.
				public static Optional<Operation2> fromString(String symbol) {
					
				   return Optional.ofNullable(stringToEnum.get(symbol));
				   
				}

		   
		}
	
	
	
	
	public static void main(String[] args) {
		
//		 double x = Double.parseDouble(args[0]);
//	     double y = Double.parseDouble(args[1]);
//	     
//	     for(Operation2 op: Operation2.values())
//	    	 System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
		String inputSymbol = "+";
		
		Optional<Operation2> operation = Operation2.fromString(inputSymbol);
		
		 operation.ifPresent(op -> System.out.println("찾은 operation: " + op));
	        
	        if (operation.isEmpty()) {
	            System.out.println("심볼에 해당하는 Operation이 없습니다: " + inputSymbol);
	        }
	     
	     
	}

}

