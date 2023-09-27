package effective_practice;

public class Practice_num34 {

	public static void main(String[] args) {

		
		
	}

}

final class CaseInsensitiveString1 implements Comparable<CaseInsensitiveString1> {
	
	
    private String s;

    public CaseInsensitiveString1(String s) {
        this.s = s;
    }

    public int compareTo(CaseInsensitiveString1 cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
}
