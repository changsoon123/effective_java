package effective_practice;

public class Practice_num60 {

	private int outerField = 10;

    public class MemberClass {
    	
        public MemberClass() {
            System.out.println("테스트!!!!! ");
        }
        
    }
	
	public static void main(String[] args) {

		// 암묵적으로 외부 클래스의 인스턴스를 사용하여 내부 클래스 생성
		Practice_num60 outerInstance = new Practice_num60();
        MemberClass member = outerInstance.new MemberClass();

        // 직접 외부 클래스의 인스턴스와 내부 클래스 생성
        MemberClass directMember = new Practice_num60().new MemberClass();
    }
		
}


