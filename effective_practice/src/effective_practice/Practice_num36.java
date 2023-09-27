package effective_practice;

import java.util.Comparator;

public class Practice_num36 {

	
	public static void main(String[] args) {

		
	        PhoneNumber11 phoneNumber1 = new PhoneNumber11();
	        PhoneNumber11 phoneNumber2 = new PhoneNumber11();


	        int result = phoneNumber1.compareTo(phoneNumber2);
	        System.out.println("Comparison result: " + result);
	    
		
	}

}


class PhoneNumber11 {
    short areaCode;
    short prefix;
    short lineNum;

//    int compareTo(PhoneNumber11 pn) {
//        short areaCode = 0;
//        short prefix = 0;
//        short lineNum = 0;
//
//        int result = Short.compare(areaCode, pn.areaCode);
//        if (result == 0) {
//            result = Short.compare(prefix, pn.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, pn.lineNum);
//        }
//
//        return result;
//    }
    
    private static final Comparator<PhoneNumber11> COMPARATOR =
    		Comparator.comparingInt((PhoneNumber11 pn) -> pn.areaCode)
			.thenComparingInt(pn -> pn.prefix)
			.thenComparingInt(pn -> pn.lineNum);
	
	public int compareTo(PhoneNumber11 pn) {
		return COMPARATOR.compare(this,pn);
	}
    
}
