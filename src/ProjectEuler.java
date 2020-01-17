
public class ProjectEuler {

	public static void main(String[] args) {

	//	System.out.println(palindrome());
		System.out.println(flip("random"));
	}

//	public static int fibonacci(int num) {
//		int evenSum = 0;
//		if (num > 4000000) {
//			return 0;
//		} else {
//			return 
//		}
//	}
	
//	public static int prime(long n) {
//		int greatest = 0;
//		
//		for (int i = 0; i < (n / 2) + 1; i++) {
//			if (n % i == 0) {
//				greatest = i;
//			}
//		}
//		return greatest;
//	}
//	
	public static int palindrome() {
		int greatest = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		String d = "";
		String half1 = "";
		String half2 = "";
		String half2flip = "";
		
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				c = i * j;
				d = "" + c;
				if (d.length() % 2 == 0) {
					half1 = d.substring(0, d.length() / 2);
					half2 = d.substring(d.length() / 2, d.length());
					
				
					
					for (int k = half2.length() - 1; k >= 0; k--) {
						half2flip = "" + half2.charAt(k);
					}
					
				} else {
					half1 = d.substring(0, (d.length() / 2) - 1);
					half2 = d.substring((d.length() / 2) + 1, d.length());
					
					for (int k = half2.length() - 1; k >= 0; --k) {
						half2flip = "" + half2.charAt(k);
						System.out.println(half2 + "|" + half2flip);
					}
					
				}
				if (half1 == half2flip) {
					if (c > greatest) {
						greatest = c;
						a = i;
						b = j;
					}
				}
				
			
			}
			
		}
		System.out.println(a + "|" + b);
		return greatest;
		
	}
	
	public static String flip(String a) {
		String flipped = "";
		int len = a.length();
		
		for (int i = len; i < 0; i--) {
			flipped = "" + a.charAt(i);
		}
		System.out.println("a");
		return flipped;
	}
	
	
}
