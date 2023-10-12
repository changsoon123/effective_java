package effective_practice;

public class Practice_num59 {

	private int outerField = 10;

    public class MemberClass {
    	
        public void accessOuterFieldFromMember() {
            // 비정적 멤버 클래스 내에서 this를 사용하여 바깥 클래스의 인스턴스 메서드 호출
            int value = Practice_num59.this.outerField;
            System.out.println("테스트! : " + value);
        }
    }

    public static class StaticMemberClass {
        public void accessOuterFieldFromStaticMember() {
            // 정적 멤버 클래스에서는 this를 사용할 수 없으며, 외부 클래스의 인스턴스 메서드를 직접 호출할 수 없음
        	
//             int value = Practice_num59.this.outerField; // 컴파일 오류
//             System.out.println("테스트! : " + value); // 컴파일 오류
        }
    }

    public void accessMemberClass() {
        MemberClass member = new MemberClass();
        member.accessOuterFieldFromMember();
    }

    public static void accessStaticMemberClass() {
        StaticMemberClass staticMember = new StaticMemberClass();
        staticMember.accessOuterFieldFromStaticMember();
    }
	
	public static void main(String[] args) {

		Practice_num59 outer = new Practice_num59();
		
		 outer.accessMemberClass(); // 외부 클래스의 메서드에서 비정적 멤버 클래스 사용
		 Practice_num59.accessStaticMemberClass(); // 외부 클래스의 정적 메서드에서 정적 멤버 클래스 사용
		
	}

}
