package effective_practice;

import java.util.function.Supplier;

public class Practice_num7 {

	public static void main(String[] args) {
		Supplier<Person1> personFactory = () -> new Person1("John");
        
        // 팩토리를 사용하여 객체 생성
        Person1 person1 = personFactory.get();
        
        System.out.println("이름: " + person1.getName());
    }
	

}

class Person1 {
	
    private String name;
    
    public Person1(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}