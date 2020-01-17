import java.util.Scanner;

public class ContestProblems {
	
	public static void main(String[] args) {
		
		//System.out.println(rotatingLetters("IAS"));
		//System.out.println(magicSquare());
		//"16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1"
	}
	
	
	
	/**
	 * CCC J2 Rotating Letters
	 * @param a
	 * @return
	 */
	public static String rotatingLetters(String a) {
		
		
		int len = a.length();
		for (int i = 0; i < len; i++) {
			if (a.charAt(i) == 'A' || a.charAt(i) == 'B' || a.charAt(i) == 'C' || a.charAt(i) == 'D' || a.charAt(i) == 'E' || a.charAt(i) == 'F' || a.charAt(i) == 'G' || a.charAt(i) == 'Y' || a.charAt(i) == 'J' || a.charAt(i) == 'K' || a.charAt(i) == 'L' || a.charAt(i) == 'M' || a.charAt(i) == 'W' || a.charAt(i) == 'P' || a.charAt(i) == 'Q' || a.charAt(i) == 'R' || a.charAt(i) == 'T' || a.charAt(i) == 'U' || a.charAt(i) == 'V') { 				
				return "NO";
			} 	
		}
		return "YES";
	}

	public static String magicSquare() {
		Scanner s = new Scanner(System.in);
		int[] nums = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
		if (nums.length != 16) {
			return "not magic";
		}
		int a = nums[0] + nums[1] + nums[2] + nums[3];
		int b = nums[4] + nums[5] + nums[6] + nums[7];
		int c = nums[8] + nums[9] + nums[10] + nums[11];
		int d = nums[12] + nums[13] + nums[14] + nums[15];
		int e = nums[0] + nums[4] + nums[8] + nums[12];
		int f = nums[1] + nums[5] + nums[9] + nums[13];
		int g = nums[2] + nums[6] + nums[10] + nums[14];
		int h = nums[3] + nums[7] + nums[11] + nums[15];
		if (a == b && a == c && a == d && a == e && a == f && a == g && a == h) {
			return "magic";
		} else {
			return "not magic";
		}
	}
	
	
	
	
	
}
