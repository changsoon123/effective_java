package effective_practice;

import java.util.Stack;

public class Practice_num13 {

	public static void main(String[] args) {

		Stack<Object> stack = new Stack<>();
        
        
        stack.push("객체1");
        stack.push("객체2");
        stack.push("객체3");

        
        Object topObject = stack.peek();
        System.out.println("맨 위 객체: " + topObject);

        
        Object poppedObject = stack.pop();
        System.out.println("제거된 객체: " + poppedObject);
        
        
        poppedObject = null;

        
        stack.clear();
		
		
	}

}
