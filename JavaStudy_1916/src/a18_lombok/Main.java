package a18_lombok;

public class Main {

	public static void main(String[] args) {
		User user = new User("junil","1234", "김준일", "skjil1218@gmail.com");
		User user2 = new User("junil","1234", "김준일", "skjil1218@gmail.com");
		
		System.out.println(user);
		System.out.println(user2);

		System.out.println(user.equals(user2));
		
		Student s = Student.builder().이름("김준일").학년("1").반("2").번호("3").build();
		System.out.println(s);
	}

}
