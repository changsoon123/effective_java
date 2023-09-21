package effective_practice;

import java.util.Objects;

public class Practice_num23 {

	public static void main(String[] args) {

		ColorPoint2 p1 = new ColorPoint2(1, 2, Color.Red);
		Point2 p2 = new Point2(1, 2);
		ColorPoint2 p3 = new ColorPoint2(1, 2, Color.Blue);
	
	
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p1));
		
	}

}

class Point2 {
    private final int x;
    private final int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
    	
        if(!(o instanceof Point2))
            return false;
        Point2 p = (Point2) o;
        return p.x == x && p.y == y;
    }
}


class ColorPoint2 {
	
    private final Point2 point;
    private final Color color;

    public ColorPoint2(int x, int y, Color color) {
        point = new Point2(x, y);
        this.color = Objects.requireNonNull(color);
    }
    
    public Point2 asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
    	
        if(!(o instanceof ColorPoint2))
            return false;
        
        ColorPoint2 cp = (ColorPoint2) o;
        return cp.point.equals(point) && cp.color.equals(color);
        
    }
}