import java.util.Scanner;

public class User {

	private int uid;
	private String username;
	private String password;
	private static int userCount = 0;
	private boolean guest;
	
	
	
	public User(int u, String user, String pass, boolean gu) {
		
		if (u > 999) {
			uid = u;
		} else {
			uid = (int) (Math.random() * 8999) + 1000;
		}
		
		if (user.length() >= 7) {
			username = user;
		} else {
			user = "";
			char[] vowels = {'a', 'e', 'i', 'o', 'u'};
			char[] constonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm','n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
			char[] constonantsCaps = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
			char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
			for (int i = 0; user.length() < 6; i++) {
				int capRand = (int) (Math.random() * 21);
				int vowRand = (int) (Math.random() * 5);
				int vowRand2 = (int) (Math.random() * 5);
				int conRand = (int) (Math.random() * 21);
				int conRand2 = (int) (Math.random() * 21);
				int numRand = (int) (Math.random() * 10);
				int numRand2 = (int) (Math.random() * 10);
				char a = constonantsCaps[capRand];
				char b = vowels[vowRand];
				char c = constonants[conRand];
				char d = vowels[vowRand2];
				char e = constonants[conRand2];
				char f = numbers[numRand];
				char g = numbers[numRand2];
				user += a;
				user += b;
				user += c;
				user += d;
				user += e;
				user += f;
				user += g;
			}
			username = user;
		}
		
		if (pass.length() >= 8) {
			password = pass;
		} else {
			pass = "";
			char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
			for (int i = 0; i <= 6; i++) {
				int rand = (int) (Math.random() * 62);
				char a = alphabet[rand];
				pass += a;
			}
			password = pass;
		}		
		
		userCount++;
	}
	
	public User(User other) {
		
		uid = other.uid;
		username = other.username;
		password = other.password;
		guest = other.guest;
		
	}
	
	
	
	
	
	public void changeUsername() {
		
		Scanner s1 = new Scanner(System.in);
		
		if(username.substring(username.length() - 3, username.length()).equals("(1)")) {
			
			System.out.println("Guest accounts cannot change their username.\n");
			
		} else {
			
			System.out.println("Your current username is: " + username);
			System.out.println("Please enter your password before proceeding: ");
			String pass = s1.next();
			

			if (pass.contentEquals(password)) {
				
				System.out.println("Please enter your new username (Must be at least 7 characters): ");
				String newuser = s1.next();
				System.out.println("Please re-enter your new username: ");
				String reenter = s1.next();
				
				if (newuser.contentEquals(reenter) && newuser.length() >= 7) {
					
					username = newuser;
					System.out.println("Mission success!");
					
				} else {
					
					System.out.println("You messed up.");
					
				}
				
			} else {
				System.out.println("Incorrect password.");
			}
		}
	}

	
	public void changePassword() {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Username: " + username + "\nPlease enter your old password: ");
		String oldPass = s1.next();
		if (oldPass.equals(password)) {
			System.out.println("Please enter your new password, it should be 8 characters or longer: ");
			String newPass = s1.next();
			
			if (newPass.length() >= 8) {
				password = newPass;
			} else {
				newPass = "";
				char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
				for (int i = 0; i <= 6; i++) {
					int rand = (int) (Math.random() * 62);
					char a = alphabet[rand];
					newPass += a;
				}
				password = newPass;
			}		
			System.out.println("Mission success!");

		} else {
			System.out.println("Incorrect password. ");
		}
		
	}
	
	public static User guestAccount(User u) {
		if (u.guest = true) {
			User guestAccount= new User(u.uid, u.username + "(1)", u.password, false);
			//userCount++;
			return guestAccount;
		} else {
			return u;
		}
		
	}

	public void showInfo() {
		System.out.print("\n");		
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("User ID #: " + uid);
		System.out.println(userCount);
		System.out.print("\n");		
	}
	
	public static User copyUser(User u) {
		
		User copy = new User(u);
		return copy;
		
	}
	
	public String toString() {
		
		return "Username: " + username + "\nPassword: " + password + "\nUser ID #: " + uid;		
	}
 	
	
	//Setters and Getters

	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static int getUserCount() {
		return userCount;
	}


	public static void setUserCount(int userCount) {
		User.userCount = userCount;
	}


	public boolean isGuest() {
		return guest;
	}


	public void setGuest(boolean guest) {
		this.guest = guest;
	}
	
	
	
}
