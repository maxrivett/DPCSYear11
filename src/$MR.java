import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class $MR {

	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void print(int s) {
		System.out.println(s);
	}
	public static void print(boolean s) {
		System.out.println(s);
	}
	public static void print(double s) {
		System.out.println(s);
	}
	public static void print(float s) {
		System.out.println(s);
	}
	public static void print(int[] s) {
		String mid = "";
		for (int a : s) {
			mid += a + ", ";
		}
		System.out.println("[" + mid.substring(0, mid.length() - 2) + "]");
	}
	
	public static void print(String[] s) {
		String mid = "";
		for (String a : s) {
			mid += a + ", ";
		}
		System.out.println("[" + mid.substring(0, mid.length() - 2) + "]");
	}	
	
	public static void print(double[] s) {
		String mid = "";
		for (double a : s) {
			mid += a + ", ";
		}
		System.out.println("[" + mid.substring(0, mid.length() - 2) + "]");
	}
	
	public static void print(float[] s) {
		String mid = "";
		for (float a : s) {
			mid += a + ", ";
		}
		System.out.println("[" + mid.substring(0, mid.length() - 2) + "]");
	}
	
	public static void print(boolean[] s) {
		String mid = "";
		for (boolean a : s) {
			mid += a + ", ";
		}
		System.out.println("[" + mid.substring(0, mid.length() - 2) + "]");
	}
	
	public static void print(int[][] s) {
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}
		
	}
	
	public static void main(String[] args) {

	//Sample ints	
		int inta = 5;
		int intb = 41;
		int intc = 238;
		
	//Sample strings
		String stringa = "hey";
		String stringb = "Hello";
		String stringc = "GREETINGS";
		
	//Sample int arrays
		int[] intarra = {3, 7};
		int[] intarrb = {13, 73, 42};
		int[] intarrc = {336, 789, 100, 641};
		int[] intarrd = {8, 7, 6, 5, 4, 3, 2, 1};
		int[] intarre = {19, 16, 21, 21, 13, 21, 30, 26, 21, 15};
		int[][] int2darra = {{3, 5, 7, 9}, {2, 4, 6, 8}};
		
	//Sample string arrays
		String[] stringarra = {"rat", "dog"};
		String[] stringarrb = {"random", "words", "yes"};
		String[] stringarrc = {"What", "am", "I", "doing", "?"};
		
	//Sample Stack	
		Stack<String> s = new Stack<>();
		s.push("one");
		s.push("two");		
		s.push("three");
		s.push("four");
		s.push("five");		
		s.push("six");
		s.push("seven");
		s.push("eight");		
		s.push("nine");
		
	//Sample Queue
		Queue<String> q1 = new LinkedList<>();
		q1.add("one");
		q1.add("two");				
		q1.add("three");
		
		
	/* "The Big 10 - Strings A" */
		
		//Test addStrings
			//print(addStrings("br", "uh"));
		//Test isEvenString
			//System.out.println(isEvenString("yes"));
		//Test pullN
			//print(pullN("Cole Parsons", 15));
		//Test findMiddleOdd
			//print(findMiddleOdd(" yessir"));
		//Test findMiddle
			//print(findMiddle("okokokokok"));
		//Test findLonger
			//print(findLonger("Cole", "Parsons"));
		//Test addStringsSmallLarge
			//print(addStringsSmallLarge("Cole", "Parsons"));
		//Test swapFirstAndLast
			//print(swapFirstAndLast("Mo"));
		//Test checkFront
			//System.out.println(checkFront("yessir", "yes"));
		//Test checkEnd
			//System.out.println(checkEnd("yessir", "sir"));
		
		
		/* "The Big 10 - Mathematics A */
		
		// Test isEven
			//System.out.println(isEven(3));
		//Test findSum
			//System.out.println(findSum(12, 57));
		//Test findAbsoluteDifference
			//System.out.println(findAbsoluteDifference(24, 34));
		//Test findLargeSum
			//System.out.println(findLargeSum(3, 6, 7));
		//Test findHyp
			//System.out.println(findHyp(5, 5));
		//Test findReverse
			//System.out.println(findReverse(34));
		//Test findSumDigits
			//System.out.println(findSumDigits(999));
		
		
		/* Other */
		
		//Test base2To10A
			//System.out.println(base2To10A(110111));
		//Test base2To10B
			//System.out.println(base2To10A(110111));
		//Test base10to2
			//print(base10to2(24));
		//Test base10toN
			//print(base10toN(8, 23));
		//Test findArrayDigitSum
			//System.out.println(findArrayDigitSum());
		//Test findArrayDigitSum
			//System.out.println(findArrayDigitSumSTR());
		//Test inputIntArray
			//System.out.println(Arrays.toString(inputIntArray()));
		//Test findAlphaSmallest
			//String[] arr = {"rat", "dog"};
			//System.out.println(findAlphaSmallest(arr));
		//Test commaInt
			//print(commaInt(-123454321));
		//Test findAlphaSmallestStack
		//Test reverseStack
			//System.out.println(reverseStack(s));
		//Test outlier
			//System.out.println(outlier(intarre));
		//Test reverseQueue
			//System.out.println(q1);
			//reverseQueue(q1);
			//System.out.println(q1);
		//Test printMatrix
			//printMatrix(5, 6);
		//Test test1_3_6
			//test1_3_6(6);
		//Test createRandomArray
			//System.out.println(createRandomArray(7, 10, 23));
		//Test foundElement
			//System.out.println(foundElement(intarrd, 5));
		//Test countPrime
			//countPrime(100);
		//Test createRandom2DArray
			//print2DRowMajor(createRandom2DArray(6, 5));
		//Test print2DRowMajor
			//print2DRowMajor(int2darra);
		//Test print2DColumnMajor
			//print2DColumnMajor(int2darra);
		//Test genSpiralArray
			//print(genSpiralArray(10));
		//Test redact
			//print(redact("bruh"));
		//Test after
			print(after("bananaphone", 'n', 6));
		
		
	}
	
	//Strings A
	
	/**
	 * pre-condition: neither a nor b are null 
	 * post-condition: a and b aren't changed
	 * @param a
	 * @param b
	 * @return new string that is a concatenated version of a and b
	 */ 
	public static String addStrings(String a, String b) {
		return a + b;
	}
	
	/**
	 * pre-condition: a is not null or empty
	 * post-condition: a is left unchanged
	 * @param a
	 * @return a boolean that shows whether the number of chars is even or not
	 */
	public static boolean isEvenString(String a) {
		if (a.length() % 2 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * pre-condition: n >= 0, a is not null
	 * post-condition: a and n are not changed
	 * @param a
	 * @param n
	 * @return the first n characters of a
	 */
	public static String pullN(String a, int n) {
		String b = "";
		if (a.length() > 0 && n > 0) {
			for (int i = 0; i < a.length(); i++) {
				if (i <= n) {
					b += a.charAt(i);
				}
			}
		}
		return b;
	}
	
	/**
	 * pre-condition: a should contain an odd number of characters
	 * post-condition: a is not changed
	 * @param a
	 * @return the string without the first and last characters if the string has an odd number of characters
	 */
	public static String findMiddleOdd(String a) {
		if (a.length() % 2 == 1) {
			return a.substring(1, a.length() - 1);
		}
		return a;
	}
	
	/**
	 * pre-condition: a cannot be null
	 * post-condition: a is not changed
	 * @param a
	 * @return the middle char if the string is odd, the middle two chars if the string is even
	 */
	public static String findMiddle(String a) {
		if (a.length() > 1) {
			if (a.length() % 2 == 1) {
				return a.charAt(a.length() / 2 + 1) + "";
			} else {
				return a.substring(a.length() / 2 - 1, a.length() / 2 + 1);
			}
		}
		return "";
	}
	
	/**
	 * pre-condition: a and b can't be null
	 * post-condition: neither a nor b is changed
	 * @param a
	 * @param b
	 * @return the longer of the two strings
	 */
	public static String findLonger(String a, String b) {
		if (a.length() > b.length()) {
			return a;
		} else if (a.length() < b.length()) {
			return b;
		} else {
			return "String length is equal.";
		}
	}
	
	/**
	 * pre-condition: neither can be null
	 * post-condition: neither gets changed
	 * @param a
	 * @param b
	 * @return the two strings combined with the larger string first
	 */
	public static String addStringsSmallLarge(String a, String b) {
		if (a.length() > b.length()) {
			return a + b;
		} else if (a.length() < b.length()) {
			return b + a;
		} else {
			return a + b;
		}
	}
	
	/**
	 * pre-condition: a must be at least two characters long
	 * post-condition: a isn't changed
	 * @param a
	 * @return the original string with the first and last char swapped
	 */
	public static String swapFirstAndLast(String a) {
		if (a.length() > 2) {
			return a.charAt(a.length() - 1) + a.substring(1, a.length() - 1) + a.charAt(0);
		} else if (a.length() == 2) {
			return a.charAt(a.length() - 1) + a.charAt(0) + "";
		}  
		return a;
	}
	
	/**
	 * pre-condition: a must be larger than b
	 * post-condition: neither gets changed
	 * @param a
	 * @param b
	 * @return true if the start of a is the same as the entirety of b, false if not
	 */
	public static boolean checkFront(String a, String b) {
		if (a.substring(0, b.length()).equals(b)) {
			return true;
		}
		return false;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean checkEnd(String a, String b) {
		if (a.substring(a.length() - b.length(), a.length()).equals(b)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Mathematics A
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @return
	 */
	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @param b
	 * @return
	 */
	public static int findSum(int a, int b) {
		return a + b;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @param b
	 * @return
	 */
	public static int findAbsoluteDifference(int a, int b) {
		int c = a - b;
		c = Math.abs(c);
		return c;
	}

	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int findLargeSum(int a, int b, int c) {
		if (a > c && b > c) {
			return a + b;
		} else if (b > a && c > a) {
			return b + c;
		} else {
			return c + a;
		}
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @param b
	 * @return
	 */
	public static double findHyp(double a, double b) {
		double a2 = a * a;
		double b2 = b * b;
		double c2 = a2 + b2;
		double c = java.lang.Math.sqrt(c2);
		return c;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @return
	 */
	public static int findReverse(int a) {
		int reverse = 0;
		
		int x = a % 10;
		a -= x;
		a /= 10;
		x *= 10;
		reverse = a + x;
		
		return reverse;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @return
	 */
	public static int findSumDigits(int a) {
		int ones = 0;
		int tens = 0;
		int hundreds = 0;
		int thousands = 0;
		
		ones = a % 10;
		a -= ones; 
		a /= 10;
		tens = a % 10;
		a -= tens;
		a /= 10;
		hundreds = a % 10;
		a -= hundreds;
		a /= 10;
		thousands = a % 10;
		a -= thousands;
		a /= 10;
		
		int total = ones + tens + hundreds + thousands;
		return total;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Other 
	
	/**
	 * pre-condition: int can only contain 0 and 1 values.
	 * post-condition:
	 * @param a
	 * @return the base 10 version of the base 2 int inputted
	 * 
	 */
	public static int base2To10A(int a) {
		int pwr = 0;
		int r = 0;
		
		while (a > 0) {
			int b = a % 10; // mod
			a = a / 10; // int division
			r += b * Math.pow(2, pwr);
			pwr++;
		}
		return r;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @return
	 */
	public static int base2To10B(int a) { // Convert to a string instead of mod --> int div 
		String value = "" + a;
		int pwr = 0;
		int r = 0;
		
		for (int i = value.length(); i >= 0; i--) {
			int b = Integer.parseInt(value.substring(i, i + 1)); //parseInt is very useful
			r += b * Math.pow(2, pwr); 
			pwr++;
		}
		return r;
	}
	
	/**
	 * pre-condition: must be a positive num
	 * post-condition:
	 * @param a
	 * @return
	 */
	public static String base10to2(int a) {
		
		String x = "";
		
		while (a > 0) {
			
			int b = a % 2;
			a /= 2;
			x = b + x; // Can't be x += b because that would return it flipped
			
		}
		return x;
		
	}
	
	/**
	 * pre-condition: base must be 10 or less
	 * post-condition:
	 * base 11 to 16 is a work in progress
	 * @param base
	 * @param a
	 * @return
	 */
	public static String base10toN(int base, int a) {
		
		String x = "";
		
		if (base <= 10) {
			while (a > 0) {
			
				int b = a % base;
				a /= base;
				x = b + x;
				
			}
		} else if (base > 10 && base <= 16) {
			
			String a1 = "";
			
			int b = a % base;
			a /= base;
			if (b > 9) {
				if (b == 10) {
					a1 = "A";
					b = 0;
				} else if (b == 11) {
					a1 = "B";
					b = 0;
				} else if (b == 12) {
					a1 = "C";
					b = 0;
				} else if (b == 13) {
					a1 = "D";
					b = 0;
				} else if (b == 14) {
					a1 = "E";
					b = 0;
				} else if (b == 15) {
					a1 = "F";
					b = 0;
				}
			}
			x = b + a1 + x;
			
			
		}
		return x;
		
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * Takes 4 ints and returns the sum of their digits using logic
	 * @return
	 */
	public static int findArrayDigitSum() {
		Scanner s = new Scanner(System.in);
		int[] a = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 10) {
				sum += a[i];
			}
			while (a[i] > 9) {
				int x = a[i] % 10;
				int y = a[i] - x;
				a[i] = y / 10;
				sum = sum + x;
				if (a[i] < 10) {
					sum += a[i];
				}
			}  
		}
		print("The total sum of the digits is...");
		return sum;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * Takes 4 ints and returns the sum of their digits using strings
	 * @return
	 */
	public static int findArrayDigitSumSTR() {
		Scanner s = new Scanner(System.in);
		int[] a = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			//CASTING - Process of changing type
			String temp = a[i] + "";
			String n1 = temp.substring(0,1);
			String n2 = temp.substring(1,2);
			sum += Integer.parseInt(n1) + Integer.parseInt(n2); //parseInt() is a static method, called with class Integer
		}
		return sum;
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @return
	 */
	public static int[] inputIntArray() {
		Scanner s = new Scanner(System.in);
		System.out.print("How many elements? --> ");
		int n = s.nextInt(); //nextInt() is an instance method, called with an instance s
		
		int[] result = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Input value #");
			System.out.print(i + 1);
			System.out.print(" --> ");
//			if (s.nextInt() < 0) {
//				System.out.print("Please enter a positive integer.");
//			} else {
			try {
				   int x = Integer.parseInt(s.next()); 
				   // You can use this method to convert String to int, But if input 
				   //is not an int  value then this will throws NumberFormatException. 
				   System.out.println("Valid input");
			} catch(NumberFormatException e) {
				   System.out.println("input is not an int value"); 
				   // Here catch NumberFormatException
				   // So input is not a int.
			} 
			result[i] = s.nextInt();
			//}
		}
		System.out.print("Your array is: ");
		return result;
		
	}
	
	/**
	 * pre-condition:
	 * post-condition:
	 * @param a
	 * @return
	 */
	public static String findAlphaSmallest(String[] a) {
		
		String smallest = a[0].toLowerCase();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].toLowerCase().charAt(0) < smallest.charAt(0)) {
				smallest = a[i].toLowerCase();
			}
		}
		return smallest;
		
	}
	
	/**
	 * pre-condition: stack is not null
	 * post-condition: new reversed stack is returned, original stack is left unchanged
	 * @param s
	 * @return
	 */
	public static Stack<String> reverseStack(Stack<String> s) {
		
		Stack<String> s1 = new Stack<>();
		Stack<String> s2 = new Stack<>();
		
		while (!s.isEmpty()) {
			String a = s.pop();
			s1.push(a);
			s2.push(a);
		}
		while (!s2.isEmpty()) {
			s.push(s2.pop());
		}
		return s1;
	}
	
	
	
	
	
	/**
	 * pre-condition: int a cannot be a string or null
	 * post-condition: a is not changed
	 * I created this code while creating a program that deciphers whether an inputted image
	 * is "warm" or "cool" and many more things. Thought it was interesting so I added it here.
	 * @param a
	 * @return the int inputted but with comma(s) in the proper spot(s)
	 */
    public static String commaInt(int a) {
    	String b = "" + a;
    	boolean negative = false;
    	int c = 2;
    	
    	if (b.charAt(0) == '-') {
    		b = b.substring(1, b.length());
    		negative = true;
    	}
    	
    	if (b.length() > 3) {
    	
    		for (int i = b.length() - 3; i > 0; i--) {
    			c++; //haha c++... get it?... like the language
    			if (c % 3 == 0 && c > 0) {
    				b = b.substring(0, i) + "," + b.substring(i, b.length());
    			}
    		}
    	}
    	
    	if (negative) {
    		b = "-" + b;
    	}
    	
    	return b;
    }

    
    /**
     * I created this tool to find outliers in a data set
     * pre-condition: array a should be storing at least five ints, otherwise it is tough
     * to find outliers
     * post-condition: array a will be changed
     * @param a
     * @return the outlier(s) in the data set 
     */
    public static String outlier(int[] a) {
    	/* 
    	   An outlier is defined as a data item that is more than 1.5 * IQR below Q1, 
    	   or 1.5 * IQR above Q3. (As per Callegaro in math class)
    	   So, if x is the data point in question...
    	   outlier if x < Q1 - 1.5 * IQR
    	   or
    	   outlier if x > Q3 + 1.5 * IQR
    	   
    	   Q1 is the median data point of the lower half of the data (25th percentile).
    	   Q3 is the median data point of the upper half of the data (75th percentile).
    	   IQR = Q3 - Q1
    	   
    	   So...
    	   outlier if x < 2.5(Q1) - 1.5(Q3)
    	   or
    	   outlier if x > 2.5(Q3) - 1.5(Q1)
    	   
    	   In order to find Q1 and Q3, we must first find the median. 
    	*/
    	
    	double median = 0;
    	double q1 = 0;
    	double q3 = 0;
//    	double iqr = 0;
    	boolean even = true;
//    	double smallest = a[0];
    	
    	if (a.length % 2 == 1) {
    		even = false;
    	}
    	
    	// Need to put the numbers in order of size first
    	Arrays.sort(a);

    	if (even) {
    		int m = 0;
    		
    		m = a.length / 2;
    		
    		int med = a[m] + a[m - 1];
    		median = med / 2;
    		
    		int q1top = m - 1;
    		int q3bottom = m;
    		int m1 = q1top / 2;
    		int m2 = q3bottom + m1;
    		
    		if (q1top % 2 == 1) {
    			q1 = a[m1];
    			q3 = a[m2];
    		} else {
    			q1 = (a[m1] + a[m1 - 1]) / 2;
    			q3 = (a[m2] + a[m2 - 1]) / 2;
    		}
    		
    	} else if (!even) {
    		int m = a.length / 2;
    		
    		median = a[m];
    		int q1top = m - 1;
    		int q3bottom = m + 1;
    		int m1 = q1top / 2;
    		int m2 = q3bottom + m1;
    		
    		if (q1top % 2 == 1) {
    			q1 = a[m1];
    			q3 = a[m2];
    		} else {
    			q1 = (a[m1] + a[m1 - 1]) / 2;
    			q3 = (a[m2] + a[m2 - 1]) / 2;
    		}
    		
    	}

    	
    	int test1 = (int) (2.5 * q1 - 1.5 * q3);
    	int test2 = (int) (2.5 * q3 - 1.5 * q1);
    	
    	String outliers1 = ""; 
    	String outliers = "";  
    	
    	for (int i = 0; i < a.length; i++) {
    		if (a[i] < test1 || a[i] > test2) {
    			outliers1 += a[i];
    			outliers1 += ", ";
    		}
    	}
    	
    	if (outliers1.length() > 2) {
    		outliers = outliers1.substring(0, outliers1.length() - 2) + ".";
    		System.out.println("The outlier(s) in this data set: ");
    	}
    	
    	
    	if (outliers.equals("")) {
    		System.out.println("There are no outliers in this data set.");
    	}
    	return outliers;
    }
    
    /**
     * 
     * @param q
     */
    public static void reverseQueue(Queue<String> q) {
    	
    	Stack<String> s = new Stack<String>();
    	
    	while(!q.isEmpty()) {
    		s.push(q.remove());
    	}
    	while (!s.isEmpty()) {
    		q.add(s.pop());
    	}
    	
    }
    
    /**
     * This tool is from question 6c on test 1-3
     * @param n
     */
    public static void test1_3_6(int n) {
    	int count = 1;
    	while (n >= count) {
    		System.out.print(count + " ");
    		count++;
    	}
    }
    
    /**
     * This function resembles question 6 from test 1-3
     * pre-condition: int a and int b must be positive integers
     * post-condition: a and b are not changed
     * @param a
     * @param b
     */
    public static void printMatrix(int a, int b) {
    	int count = 1;
    	for (int i = 0; i < a; i++) {
    		if (i > 0) {
    			System.out.println("");
    		}
    		for (int j = 0; j < b; j++) {
    			System.out.print(count + " ");
    			if (count >= b) {
    				count = 0;
    			}
    			count++;
    		}
    	}
    	
    	
    }
    
    /**
     * We created this tool in class. It is made to create a new int array that contains 'a' ints,  
     * each of them random ints between b and c.
     * precondition: c > b, a > 0
     * postcondition: ints are not changed
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int[] createRandomArray(int a, int b, int c) {
    	int d = 0;
    	int arr[] = new int[a];
    	
    	for (int i = 0; i < a; i++) {
    	
    		d = new Random().nextInt(c - b)  + b;
    		
    		arr[i] = d;
    		
    	}
    	System.out.println(Arrays.toString(arr));
    	
    	return null;
    }
    
    
    public static boolean foundElement(int a[], int b) {
    	boolean bool = false;
    	for (int i = 0; i < a.length; i++) {
    		if (a[i] == b) {
    			bool = true;
    			break;
    		}
    	}
    	return bool;
    }
    
    /**
     * This tool counts the number of primes below the int inputted, and then puts them in an array.
     * pre-condition: int a must be at least 3
     * post-condition: a is unchanged
     * @param a
     * @return
     */
    public static void countPrime(int a) {
    	int num = 0;
    	int num2 = 0;
    	boolean prime = true;
    	for (int i = 2; i < a; i++) {
    		for (int j = 2; j <= i / 2; j++) {
    			if (i % j == 0) {
    				prime = false;
    			}
    		}
    		if (prime) {
    			num++;
    		}
    		prime = true;
    	}
    	int[] arr = new int[num];
    	for (int i = 2; i < a; i++) {
    		for (int j = 2; j <= i / 2; j++) {
    			if (i % j == 0) {
    				prime = false;
    			}
    		}
    		if (prime) {
    			arr[num2] = i;
    			num2++;
    		}
    		prime = true;
    	}
    	print("There are " + num + " prime numbers under " + a + ". They are:");
    	print(arr);
    }
    
    /**
     * This tool creates a 2D array of random numbers.
     * pre-condition: ints rows and columns cannot be negative
     * post-condition: neither will be changed
     * @param rows
     * @param columns
     * @return
     */
    public static int[][] createRandom2DArray(int rows, int columns) {
    	
    	int[][] arr = new int[rows][columns];
    	
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[i].length; j++) {
    			arr[i][j] = (int)(Math.random() * 100);
    		}
    	}
    	return arr;
    	
    }
    
    /**
     * Takes a 2D array input and puts it in row major form.
     * pre-condition: array cannot be null
     * post-condition: array is not changed
     * @param arr
     */
    public static void print2DRowMajor(int[][] arr) {
    	
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[i].length; j++) {
    			System.out.print(arr[i][j]);
    		}
    	}
    	
    	
    }
    
    /**
     * Takes a 2D array input and puts it in column major form.
     * pre-condition: array cannot be null
     * post-condition: array is not changed
     * @param arr
     */
    public static void print2DColumnMajor(int[][] arr) {
    	
    	for (int i = 0; i < arr[0].length; i++) {
    		for (int j = 0; j < arr.length; j++) {
    			System.out.print(arr[j][i]);
    		}
    	}
    	
    }
    
    
    public static int[][] genSpiralArray(int n) {
	    	int count = 1;
	    	int t = 0;
	    	int b = n - 1;
	    	int l = 0;
	    	int r = n - 1;
	    	int[][] arr = new int[n][n];
	    	
	    	while (count <= n * n) {
	    		
	    		for (int i = l; i <= r; i++) {
	    			arr[t][i] = count;
	    			count++;
	    		}
	    		t++;
	    		for (int i = t; i <= b; i++) {
	    			arr[i][r] = count;
	    			count++;
	    		}
	    		r--;
	    		for (int i = r; i >= l; i--) {
	    			arr[b][i] = count;
	    			count++;
	    		}
	    		b--;
	    		for (int i = b; i >= t; i--) {
	    			arr[i][l] = count;
	    			count++;
	    		}
	    		l++;
	    		
	    	}
	    	return arr;
    }
    
    
    public static boolean isVowel(char a) {
    	String b = a + "";    	
    	b = b.toLowerCase();    	
    	a = b.charAt(0);
     	String s = "aieouy";
    	int i = s.indexOf(a);
    	if (i >= 0) {
    		return true;
    	} else {
    		return false;
    	}
    	
    }
    
    public static String redact(String s) {
    	
    	if (s.length() < 3) {
    		return s;
    	} else {
    		return s.charAt(0) + "xxx" + s.charAt(s.length() - 1);
    	}
    }
    
    public static String after(String s, char c, int n) {
    
    	int pos = s.indexOf(c) + 1;

    	String sub = s.substring(pos, s.length());
    	
    	if (n <= sub.length()) {
    		return sub.substring(0, n);
    	} 
    	return sub;
    	
    	
    }
    
}