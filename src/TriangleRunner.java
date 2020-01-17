
public class TriangleRunner {

	public static void main(String[] args) {

		Triangle t1 = new Triangle(2, 4, true);
				
		System.out.print("The area of the triangle is: ");
		t1.getArea();
		
		System.out.print("The hypotenuse of the triangle is: ");
		t1.getHypotenuse();
		
		t1.getAngles();
	}
	
}
