package effective_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Practice_num27 {

	public static void main(String[] args) {

		Map<Person4, String> personMap = new HashMap<>();
		
        Person4 person1 = new Person4("Alice", 25);
        Person4 person2 = new Person4("Alice", 25);

        personMap.put(person1, "Employee");


        String role = personMap.get(person2);
        
        System.out.println("Role: " + role);
        
	}

}

class Person4 {
    private String name;
    private int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person4 person = (Person4) o;
        return age == person.age && name.equals(person.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
