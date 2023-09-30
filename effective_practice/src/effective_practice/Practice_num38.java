package effective_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_num38 {

	private static class Thing {}
	
	private static final Thing[] PRIVATE_VALUES = {};
	
	public static final List<Thing> VALUE =
			Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
	
	public static final Thing[] values() {
		return PRIVATE_VALUES.clone();
	}
	
	public static void main(String[] args) {

	}

}
