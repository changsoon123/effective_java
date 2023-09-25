package effective_practice;

public class Practice_num29 {

	private String name;
	
    private int age;
	
    public Practice_num29(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        // 포맷 메서드를 사용하여 문자열을 생성
        return String.format("Person{name='%s', age=%d}", name, age);
    }
	
	public static void main(String[] args) {

		
		Practice_num29 person = new Practice_num29("John Doe", 30);

        String formattedString = person.toString();

        System.out.println(formattedString);
		
	}

}
