package effective_practice;

public class Practice_num25 {

	public static void main(String[] args) {

		
		
	}
	
}

class Practice1{
	
		//명시적 null 검사
	@Override public boolean equals(Object o) {
		if(o == null)
			return false;
	
	System.out.println("명시적 null!!");
	
	return true;
	
	}
	
	
}

class Practice2{
	
	//묵시적 null 검사
	@Override public boolean equals(Object o) {
		if(!(o instanceof Practice2))
			return false;

		System.out.println("묵시적 null!!");

		return true;

}


}
