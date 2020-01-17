
public class Circle {

	/*
	 * Build a Circle class.  It should... 
	 	* Have a selection of instance variables (fields) 
	 	* Have a selection of constructors
	 	* Have a selection of instance methods
	 */
	
	//Instance variables
	
	private double radius;
	private double x;
	private double y;
	
	//Constructors
	
	public Circle() { radius = 1; }
	
	public Circle(double r) {
		if (r > 0) {
			radius = r;
		} else {
			radius = 1;
		}
	}
	
	public Circle(double r, double x, double y) {
		if (r > 0) {
			radius = r;
		} else {
			radius = 1;
		}
		this.x = x;
		this.y = y;
	}
	
	//Instance Methods
	
	public void getArea() {
		// area  = pi x r(squared)
		double area = (double) Math.PI * Math.pow(radius, 2);
		System.out.println(area);
	}
	
	public void getCircumference() {
		// cir  = pi x diameter
		double cir = (double) Math.PI * (radius + radius);
		System.out.println(cir);
	}

	public double getRadius() { return radius; }	
	public void setRadius(int r) { 
		if (r <= 0) {
			r = 1;
		}
	}
	
	//Getters and Setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
