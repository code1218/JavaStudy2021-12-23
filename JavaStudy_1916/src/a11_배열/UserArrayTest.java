package a11_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		User user = new User("junil", "1234", "김준일", "skjil1218@gmail.com");
		User user2 = new User("junil", "1234", "김준사", "skjil1218@gmail.com");
		
		users[0] = user;
		users[4] = user2;
		
		
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			users[i].showUserInfo();
		}

	}

}
