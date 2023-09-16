package effective_practice;

public class Practice_num12 {

	public static void main(String[] args) {
		
		int primitiveInt = 1000000;
        Integer boxedInt = 1000000;
        
        long startTime, endTime;
        
        
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            primitiveInt += 1;
        }
        endTime = System.nanoTime();
        System.out.println("기본 타입 사용 시간: " + (endTime - startTime) + " 나노초");
        
        
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            boxedInt += 1; 
        }
        endTime = System.nanoTime();
        System.out.println("박싱된 기본 타입 사용 시간: " + (endTime - startTime) + " 나노초");

	}

}
