package effective_practice;

public class Practice_num133 {

	enum DayType {
        WEEKDAY,
        WEEKEND
    }
	
	public static void main(String[] args) {

//		boolean isWeekend = false;
//
//
//        if (isWeekend) {
//            System.out.println("주말이다!");
//        } else {
//            System.out.println("주중이다.");
//        }
        
        DayType dayType = DayType.WEEKDAY;


        if (dayType == DayType.WEEKEND) {
            System.out.println("주말이다!");
        } else {
            System.out.println("주중이다.");
        }
        
        
		
	}

}
