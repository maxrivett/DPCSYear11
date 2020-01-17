
public class FractionRunner {

	public static void main(String[] args) {
//		
//		Fraction f1 = new Fraction();
//		Fraction f2 = new Fraction();
//		
//		f1.getNum() = 8;
//		f1.getDen() = 10;
//		
//		f2.getNum() = 4;
//		f2.getDen() = 5;
//		
//		System.out.println(f1);
//		
//		Fraction g = f1;
//		
//		System.out.println(g.getNum() + "/" + g.getDen());
//		
//		g.getNum() = 1;
//		g.getDen() = 2;
//		
//		System.out.println(f1.getNum() + "/" + f1.getDen());
//	
//		f1.getDecimal();
//		
//		f1.setReciprocal();
//		
//		f1.getDecimal();
//		
//		System.out.print(f1.getNum() + "/" + f1.getDen());
		
		Fraction f3 = new Fraction(3, 7);
		Fraction f4 = new Fraction(7, 4);
		



		System.out.println("-------------------------------------------");

		
		System.out.println("|   The original fractions are: " + f3.getNum() + "/" + f3.getDen() + " and " + f4.getNum() + "/" + f4.getDen() + "|");
		
		
		Fraction f5 = Fraction.multiplyFractions(f3, f4);
		
		System.out.println("|       When you multiply them you get: " + f5.getNum() + "/" + f5.getDen() + "|");
		
		System.out.print("|               In decimal form it is: ");
		f5.getDecimal();
		System.out.println("|");
		System.out.print("|              The reciprocal of " + f5.getNum() + "/" + f5.getDen() + " is ");
		f5.setReciprocal();
		System.out.println(f5.getNum() + "/" + f5.getDen() + "|");
		System.out.println("-------------------------------------------");
		System.out.println(Fraction.getFractionCount());
		
	}
	 
}
