package effective_practice;

public class Practice_num30 {

	private String name;
    private int age;

    public Practice_num30(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "MyObject{name='" + getName() + "', age=" + getAge() + '}';
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
	public static void main(String[] args) {

		Practice_num30 obj = new Practice_num30("John Doe", 30);
        
        // API를 사용하여 객체 정보 추출
        String name = obj.getName();
        int age = obj.getAge();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
		
	}

}
