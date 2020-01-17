
public class Fraction {

	// Attributes/Fields
		// Suggestion: Never use the same variable name that a field is in your class
	
	private int num;
	private int den;
	private static int fractionCount = 0;
	
	// Constructors
		// Constructors are special instance methods that are only called once at time of construction
		// A constructor does not indicate a return type
		// A constructor must be public
		// A constructor is always named using the class name
	
	public Fraction(int n, int d) {
		num = n;
		if (d!= 0) {
			den = d;
		} else {
			den = 1;
		}
		fractionCount++;
		
	}
	
	
	
	
	// Behaviours
	
	public void reduce() {
		
		// Step 1: Find greatest common factor (gcf)
		
		int gcf = 1;
		
		for (int i = 2; i < Math.min(this.num, this.den); i++) {
			
			if (this.num % i == 0 && this.den % i == 0) {
				
				gcf = i;
				
			}
			
		}
		
		// Step 2: Divide num and den by gcf
		
		this.num = this.num / gcf;
		this.den = this.den / gcf;
		
	}
	
	public void setReciprocal() {
		
		if (this.num != 0 && this.den != 0) {
			
			int a = this.num;
			int b = this.den;
			
			this.num = b;
			this.den = a;
			
		}
		
	}
	
	public void getDecimal() {
		
		double dec = (double) this.num / this.den;
		System.out.print(dec);
		
	}
	
	public static Fraction multiplyFractions(Fraction f1, Fraction f2) {
		Fraction out = new Fraction(0, 0);
		int num = f1.num * f2.num;
		int den = f1.den * f2.den;

		out.num = num;
		out.den = den;
		
		out.reduce();
		
		//System.out.println(out.num + "/" + out.den);
		return out;
		
	}
	
	public int getNum() { return num; }
	public int getDen() { return den; }
	public static int getFractionCount() { return fractionCount; }
	public void setNum(int n) { num = n; }	
	public void setDen(int d) { 
		if (d != 0) {
			den = d; 
		}
	}
	
}
