package effective_practice;

import java.time.Instant;

public final class Practice_num48 extends Super {
	
	private final Instant instant;
	
	Practice_num48(){
		instant = Instant.now();
	}
	
	@Override 
	public void overrideMe() {
		System.out.println(instant);
	}
	

	public static void main(String[] args) {

		Practice_num48 sub = new Practice_num48();
		sub.overrideMe();
	}

}

class Super{
	public Super() {
		
	}
	
	public void overrideMe() {
		
	}
}


