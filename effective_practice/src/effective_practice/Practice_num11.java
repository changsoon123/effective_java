package effective_practice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Practice_num11 {
    public static void main(String[] args) {
    	
    	String text = "Hello, World!";
        
        
        Pattern pattern = Pattern.compile("Hello,.*");
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.matches()) {
            System.out.println("문자열과 패턴이 일치합니다.");
        } else {
            System.out.println("문자열과 패턴이 일치하지 않습니다.");
        }
        
        
    }
}
