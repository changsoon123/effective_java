package effective_practice;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_num10 {

    public static void main(String[] args) {
    	
    	String text = "Hello, World!";
        
    	
        boolean isMatch = text.matches("Hello,.*");
        
        if (isMatch) {
            System.out.println("문자열과 패턴이 일치합니다.");
        } else {
            System.out.println("문자열과 패턴이 일치하지 않습니다.");
        }
        
    }
}