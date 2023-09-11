package effective_practice;

import java.io.*;

public class Practice_num5 {

	public static void main(String[] args) {
		
		
		
	}

}

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // 직렬화 버전 UID
    private String name;
    private transient int age;
    
    private static final Person INSTANCE = new Person();


    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
    public static Person getInstance() {
        return INSTANCE;
    }
    
    // readResolve 메서드: 역직렬화 시에 호출되며, 싱글톤 객체를 반환
    private Object readResolve() {
        return INSTANCE;
    }
}

class SerializationExample {
    public static void main(String[] args) {
        // 객체 생성
        Person person = new Person();

        // 객체를 파일로 직렬화
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(person);
            System.out.println("직렬화 완료: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일로부터 객체를 역직렬화
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Person deserializedPerson = (Person) objectIn.readObject();
            System.out.println("역직렬화 완료: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}