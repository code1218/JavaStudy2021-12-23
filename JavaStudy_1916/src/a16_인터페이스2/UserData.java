package a16_인터페이스2;

public class UserData {
	private User[] userDataBase;
	
	public UserData() {
		userDataBase = new User[5];
	}
	
	public User[] getUserDataBase() {
		return userDataBase;
	}

	public void setUserDataBase(User[] userDataBase) {
		this.userDataBase = userDataBase;
	}

	public void insertUsers() {
		userDataBase[0] = new User("aaaa", "1234", "김준일", "skjil1211@gmail.com");
		userDataBase[1] = new User("bbbb", "1234", "김준이", "skjil1212@naver.com");
		userDataBase[2] = new User("cccc", "1234", "김준삼", "skjil1213@kakao.com");
		userDataBase[3] = new User("dddd", "1234", "김준사", "skjil1214@facebook.com");
		userDataBase[4] = new User("eeee", "1234", "김준오", "skjil1215@instagram.com");
	}
}
