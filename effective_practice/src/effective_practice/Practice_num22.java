package effective_practice;

public class Practice_num22 {

	public static void main(String[] args) {

		ColorPoint p1 = new ColorPoint(1, 2, Color.Red);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.Blue);
	
	
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p1));
		
	}

}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point))
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}

class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
    	
    	if(!(o instanceof Point))
    		return false;
    	
        if(!(o instanceof ColorPoint))
            return o.equals(this);
        
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}

class Color {

	public static Color Blue = new Color();
	public static Color Red = new Color();
	
	
	
}