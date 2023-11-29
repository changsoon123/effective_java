package effective_practice;

import java.util.Date;

public class Practice_num131 {

	
	
	public static void main(String[] args) {

	
//		Date start = new Date();
//	    Date end = new Date();
//	    Period p = new Period(start, end);
//	    end.setYear(78); // p 내부 수정

		Date start = new Date();
		Date end = new Date();
		Period p = new Period(start, end);
		p.end().setYear(78);
		
	}

}

final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param  start 시작 시각
     * @param  end 종료 시각. 시작 시각보다 뒤여야 한다.
     * @throws IllegalArgumentException 시작 시각이 종료 시각보다 늦을 때 발생한다.
     * @throws NullPointerException start나 end가 null이면 발생한다.
     */
    public Period(Date start, Date end) {
    	this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        
        if (this.start.compareTo(this.end) > 0) 
            throw new IllegalArgumentException(this.start + " after " + this.end);
    }

    public Date start() {
        return new Date(start.getTime());
    }
    public Date end() {
    	return new Date(end.getTime());
    }

    public String toString() {
        return start + " - " + end;
    }
    
    
    
}