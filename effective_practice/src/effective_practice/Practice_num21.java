package effective_practice;

import java.util.Objects;

public class Practice_num21 {

	public static void main(String[] args) {

		CaseInsensitiveString2 cis = new CaseInsensitiveString2("hello");
		String str = "Hello";

		
		boolean symmetric1 = cis.equals(str); 

		
		boolean symmetric2 = str.equals(cis); 
	
		
		System.out.println(symmetric1);
		System.out.println(symmetric2);
		
	}

}

final class CaseInsensitiveString2{
	
	private final String s;

	public CaseInsensitiveString2(String s){
		this.s = Objects.requireNonNull(s);
	}
	
	@Override
	public boolean equals(Object o) {
	    return o instanceof CaseInsensitiveString2 && ((CaseInsensitiveString2) o).s.equalsIgnoreCase(s); 
	}
}


