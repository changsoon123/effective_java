package effective_practice;

import java.util.Objects;

public class Practice_num20 {

	public static void main(String[] args) {

		
		CaseInsensitiveString cis = new CaseInsensitiveString("hello");
		String str = "Hello";

		// cis.equals(str)는 true를 반환합니다.
		boolean symmetric1 = cis.equals(str); // true

		// str.equals(cis)는 false를 반환합니다.
		boolean symmetric2 = str.equals(cis); // false
	
		
		System.out.println(symmetric1);
		System.out.println(symmetric2);
		
	}

}

//대칭성을 위반한 클래스
final class CaseInsensitiveString{
	private final String s;

	public CaseInsensitiveString(String s){
		this.s = Objects.requireNonNull(s);
	}

// 대칭성 위배!
@Override public boolean equals(Object o){
	if(o instanceof CaseInsensitiveString)
		return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
	
 	if(o instanceof String) // 한방향으로만 작동한다.
	 	return s.equalsIgnoreCase((String) o);
 	
 			return false;
		}
}