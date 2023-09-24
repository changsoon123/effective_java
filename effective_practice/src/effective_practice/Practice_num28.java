package effective_practice;

public class Practice_num28 {

	public static void main(String[] args) {

		HashCodePractice practice = new HashCodePractice((short)1, (short)1234,(short)5678);
		
		System.out.println(practice);
		
		
		
	}

}

class HashCodePractice{
	
	 private short areaCode;
	 private short prefix;
	 private short lineNum;

	 
	 
	 public HashCodePractice(short areaCode, short prefix, short lineNum) {
	        this.areaCode = areaCode;
	        this.prefix = prefix;
	        this.lineNum = lineNum;
	 }
	
	private int hashCode;
	 
	@Override
	public int hashCode() {
		int result = hashCode;
		
		if(result == 0) {
	    result = Short.hashCode(areaCode);
	    result = 31 * result + Short.hashCode(prefix);
	    result = 31 * result + Short.hashCode(lineNum);
		}
		
	    return result;
	}
	

}
