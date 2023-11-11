package effective_practice;

import java.io.*;

public class Practice_num105 {

	public static void main(String[] args) {

		 try {
	            // 직렬화 가능한 객체 생성
	            SerializableClass serializableObject = new SerializableClass("Serializable Object");

	            // 직렬화 불가능한 객체 생성
	            NonSerializableClass nonSerializableObject = new NonSerializableClass("Non-Serializable Object");

	            // ObjectOutputStream을 사용하여 객체를 파일에 쓰기
	            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.bin"))) {
	                // Serializable 객체 쓰기
	                oos.writeObject(serializableObject);

	                // Non-Serializable 객체 쓰기
//	                oos.writeObject(nonSerializableObject);  // 여기서 런타임 에러 발생 가능
	            }

	            // ObjectInputStream을 사용하여 객체를 파일에서 읽기
	            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.bin"))) {
	                // Serializable 객체 읽기
	                SerializableClass deserializedSerializableObject = (SerializableClass) ois.readObject();
	                System.out.println("Deserialized Serializable Object: " + deserializedSerializableObject.getData());

	                // Non-Serializable 객체 읽기
//	                NonSerializableClass deserializedNonSerializableObject = (NonSerializableClass) ois.readObject();
//	                System.out.println("Deserialized Non-Serializable Object: " + deserializedNonSerializableObject.getData());
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
		
	}

}

//Serializable을 구현한 클래스
class SerializableClass implements Serializable {
 private static final long serialVersionUID = 1L;
 private String data;

 public SerializableClass(String data) {
     this.data = data;
 }

 public String getData() {
     return data;
 }
}

//Serializable을 구현하지 않은 클래스
class NonSerializableClass {
 private String data;

 public NonSerializableClass(String data) {
     this.data = data;
 }

 public String getData() {
     return data;
 }
}