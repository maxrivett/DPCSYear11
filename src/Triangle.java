
public class Triangle {

	private double height;
	private double width;
	private boolean right;
	private double x;
	private double y;
	
	//Constructors
	public Triangle(double h, double w, boolean r) {
		
		if (h > 0) {
			height = h;
		} else {
			height = 1;
		}
		
		if (w > 0) {
			width = w;
		} else {
			width = 1;
		}
		
		if (r) {
			right = true;
		} else {
			right = false;
		}
		
	}
	
	//Behaviours
	public void getHypotenuse() {
		
		if (right) {
			double c2 = Math.pow(height, 2) + Math.pow(width, 2);
			double hyp = Math.sqrt(c2);
			System.out.println(hyp);
		} else {
			System.out.println("Must be a right triangle...");
		}
	}
	
	public void getArea() {
		
		double area = (width * height) / 2;
		System.out.println(area);

	}
	
	public void getAngles() {
		
		double a1 = Math.tan(width / height);
		double a2 = Math.tan(height / width);
		
		
		System.out.println(a1 + "" + a2);
		
	}

	
	//Getters & Setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

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
