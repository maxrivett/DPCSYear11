
public class UserRunner {

	public static void main(String[] args) {

		
		User u1 = new User(999, "2short", "longenough", false);
		User u2 = new User(2020, "longusername", "short", true);
		
		System.out.println(u1);	
//		
//		u1.showInfo();
//		u2.showInfo();
//		User guest = User.guestAccount(u2);
//		guest.showInfo();
//
//		u2.changeUsername();
//		u2.showInfo();
//		guest.showInfo();
//		
//		User u3 = User.copyUser(u1);
//		u3.showInfo();
		
	}
	
}
