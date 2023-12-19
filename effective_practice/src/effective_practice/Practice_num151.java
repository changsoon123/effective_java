package effective_practice;

public class Practice_num151 {

	private static final int LINE_WIDTH = 0;

	public String statement() {
	    String result = "";
	    for (int i = 0; i < numItems(); i++) 
	        result += lineForItem(i);    //문자열 연결
	    return result;
	}
	
	public String statement2() {
	    StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
	    for (int i = 0; i < numItems(); i++)
	        b.append(lineForItem(i));
	     return b.toString(); 
	}
	
	private String lineForItem(int i) {
		return null;
	}

	private int numItems() {
		return 0;
	}

	public static void main(String[] args) {

		
		
	}

}
