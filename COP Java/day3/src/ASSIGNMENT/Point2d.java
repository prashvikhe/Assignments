package ASSIGNMENT;

public class Point2d {
	private int x,y;

	public Point2d() {
		System.out.println("default constructor is called");
	}
	
	
	public Point2d(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		System.out.println("parameterized constr is called");
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}
	
	public String toString() {
		return "x= "+x+"  y= "+y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
}
