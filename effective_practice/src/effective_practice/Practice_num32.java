package effective_practice;

import java.util.Arrays;

public class Practice_num32 {

	public static void main(String[] args) {

		
		
	}

}

class MyStack implements Cloneable {
	
	private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public MyStack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    // 다른 메서드들 (push, pop 등) 생략

    @Override
    public MyStack clone() {
        try {
            MyStack cloned = (MyStack) super.clone();
            cloned.elements = elements.clone(); 
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // 발생하지 않아야 하는 예외
        }
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object result = elements[--size];
        elements[size] = null; // 사용하지 않는 참조 해제
        return result;
    }
    
    private void ensureCapacity() {
    	if(elements.length == size)
    		elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}