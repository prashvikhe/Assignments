package Day05;


//4. Create a class Point with data members as x,y. Create Default and Parameterized
//constructors. Write getters and setters for all the data members. Also add the 
//display function. Create the object of this 
//class in main method and invoke all the methods in that class. 

public class Point {
	private int x,y;
	
	
	public void display() {
		System.out.println("x= "+x+"y= "+y);
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


	public void setY(int y) {
		this.y = y;
	}
	
	public Point() {}


	public Point(int x, int y) {
		this.x = 12;
		this.y = 10;
	}
	
}


 
 