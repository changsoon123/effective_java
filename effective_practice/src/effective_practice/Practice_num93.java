package effective_practice;

import effective_practice.Practice_num90.Operation;

public class Practice_num93 {

	public static Operation inverse(Operation operation) {
        switch (operation) {
            case PLUS:
                return Operation.MINUS;
            case MINUS:
                return Operation.PLUS;
            case TIMES:
                return Operation.DIVIDE;
            case DIVIDE:
                return Operation.TIMES;
        }
        throw new AssertionError("알 수 없는 연산 : " +operation);
}
	
	public static void main(String[] args) {

		
		
	}

}

