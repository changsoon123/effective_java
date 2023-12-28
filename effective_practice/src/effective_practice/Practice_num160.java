package effective_practice;

class TheCheckedException extends RuntimeException {
	
	
}

public class Practice_num160 {

	public static void main(String[] args) {

		try {
			
			 throw new TheCheckedException();
			
		}  catch (TheCheckedException e) {
//			e.printStackTrace();
//			System.exit(1);
		    throw new AssertionError();
		}
		
	}

}

