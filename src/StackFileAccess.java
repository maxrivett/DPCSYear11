import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class StackFileAccess {

	public static void main(String[] args) {
		
		Stack<Integer> stack1 = readToIntStack("files/dataInINT.txt");
		System.out.println(stack1);
		Stack<Integer> stack2 = new Stack<Integer>();
		
		int r = (int)(Math.random()*100);
		
		for (int i = 0; i < r; i++) {
			int v = (int)(Math.random()*100);
			stack2.add(v);
		}

		
	}
	
	public static Stack<Integer> readToIntStack(String file) {
		
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);

			Stack<Integer> out = new Stack<Integer>();

			while (s.hasNext()) {
				out.push(s.nextInt());
			}
			return out;

		} catch (FileNotFoundException e) {

			System.out.println("File not found.");

		}

		return null;

	}
	
	public static void writeIntStackToFile(Stack<Integer> stack, String file) {
		
		try {
			File f = new File(file);
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			
//			while (!stack.isEmpty()) { //IB Approach
//				pw.println(stack.pop());
//			}
			
			int size = stack.size();
			
			for (int i = 0; i < size; i++) {
				pw.println(stack.get(i));
			}
			pw.close();
			
		} catch(Exception e) {
			System.out.println("Error writing int stack to file.");
			e.printStackTrace();
		}
		
	}
	
}
