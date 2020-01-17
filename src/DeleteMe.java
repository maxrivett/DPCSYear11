import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DeleteMe {

	public static void main(String[] args) {
		
		// Creating a stack
		// REFERENCE TYPE = new OBJECT TYPE
		Stack<String> s1 = new Stack<>();
		// Reference Type; It tells you what to expect when you follow the reference to the object.
		// Object Type: This is what you actually find.
		// Generally at this stage the object type and reference type match. Eventually they won't.
		
		Scanner s = new Scanner(System.in);
		Object os = new Scanner(System.in); // bad but valid
		// Scanner so = new Object(); // invalid
		
		s1.push("one");
		s1.push("two");		
		s1.push("three");
		s1.push("four");
		s1.push("five");		
		s1.push("six");
		s1.push("seven");
		s1.push("eight");		
		s1.push("nine");
		
//		System.out.println(s1); // bottom of stack prints on left, top on right
//		
//		s1.pop();
//	
//		System.out.println(s1);
		
		
//		Stack<String> ss = ("bruh", "ok", "yes");
		
		smallestAlphabeticallyStack(s1);
	}
	
	
	/**
	 * A stack S has an unknown number of strings. Write pseudocode to output the alphabetically
	 * smallest value. The stack must be left unchanged at the end.
	 * 
	 * @param s
	 */
	public static void smallestAlphabeticallyStack(Stack<String> s) {
	//	Scanner a = new Scanner(System.in);
		//Stack<String> s = new Stack<>();
		Stack<String> s1 = new Stack<>();
		String smallest = s.pop().toLowerCase();
		
		

		
		while (!s.isEmpty()) {
			String s2 = s.pop();
			if (s2.toLowerCase().charAt(0) < smallest.charAt(0)) {
				smallest = s2;
			}
			s1.push(s2);
		}
		while (!s1.isEmpty()) {

			s.push(s1.pop());
			
		}		
		System.out.println(smallest);
	}
	
	
}
