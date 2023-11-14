package effective_practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.DoubleBinaryOperator;

//interface Operation {
//    double apply(double x, double y);
//}

enum Operation {
    
	PLUS( "+" , (x,y) -> x + y ),
	MINUS( "-" , (x,y) -> x - y ),
	TIMES( "*" , (x,y) -> x * y ),
	DIVIDE( "/" , (x,y) -> x / y );

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op ) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override public String toString() {
        return symbol;
    }
    
    public double apply(double x, double y) {
    	return op.applyAsDouble(x, y);
    };
}

//enum ExtendedOperation implements Operation {
//    EXP("^") {
//        public double apply(double x, double y) {
//            return Math.pow(x, y);
//        }
//    },
//    REMAINDER("%") {
//        public double apply(double x, double y) {
//            return x % y;
//        }
//    };
//    private final String symbol;
//    ExtendedOperation(String symbol) {
//        this.symbol = symbol;
//    }
//    @Override public String toString() {
//        return symbol;
//    }
//}




public class Practice_num99 {
	
//	private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
//	    for (Operation op : opEnumType.getEnumConstants())
//	        System.out.printf("%f %s %f = %f%n",
//	                x, op, y, op.apply(x, y));
//	}
//	

//	private static void test(Collection<? extends Operation> opSet, double x, double y) {
//			for (Operation op : opSet)
//				System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
//	}
//	
//	
	public static void main(String[] args) {
//
//		double x = Double.parseDouble(args[0]);
//	    double y = Double.parseDouble(args[1]);
////	    test(ExtendedOperation.class, x, y);
//	    test(Arrays.asList(ExtendedOperation.values()), x, y);
	
		double result = Operation.PLUS.apply(3.0, 4.0);
		System.out.println(result);
	
	}
	    
	
}
