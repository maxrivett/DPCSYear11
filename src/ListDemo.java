import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		
		// Reference Type = Object Type (constructing the array list)
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		list.add(6);
//		System.out.println(list);
	
		ArrayList<Character> chlist = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
		String vowels = "";
		String consonants = "";
		
		for (int i = chlist.size() - 1; i >= 0; i-- ) {
			if ($MR.isVowel(chlist.get(i))) {
				vowels += chlist.remove(i) + ", "; 
			} else {
				consonants += chlist.remove(i) + ", "; 
			}
		}
		System.out.println("The vowels are: " + vowels.substring(0, vowels.length() - 2) + ".");
		System.out.println("The consonants are: " + consonants.substring(0, consonants.length() - 2) + ".");
		
	}
	
}
