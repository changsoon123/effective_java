package effective_practice;

public class Practice_num42 {

	public static void main(String[] args) {

		Point21 pra = new Point21(3, 10);
		
		
		
		System.out.println(pra.getX());
		System.out.println(pra.getY());
		
		
	}

}

class Point21 {
	  private double x;
	  private double y;

	  public Point21 (double x, double y) {
	    this.x = x;
	    this.y = y;
	  }

	  public double getX() { return x; }
	  public double getY() { return y; }

	  public void setX(double x) { this.x = x; }
	  public void setY(double y) { this.y = y; }
	}

