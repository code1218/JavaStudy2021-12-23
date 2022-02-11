package a19_제네릭;

public class GenericEx {
	
	public Message<? extends User> sendMessage(int select){
		if(select == 1) {
			PersonalUser personalUser = new PersonalUser("kim jun il");
			return new Message<PersonalUser>(10, personalUser);
		}else if(select == 2) {
			CompanyUser companyUser = new CompanyUser("korea it");
			return new Message<CompanyUser>(20, companyUser);
		}else {
			User user = new User("aaaa", "1234");
			return new Message<User>(0, user);
		}
	}

	public static void main(String[] args) {
		/*
		Message<String> strMessage = new Message<String>();
		strMessage.setCode(10);
		strMessage.setData("오류메세지입니다.");
		
		System.out.println("strMessage: " + strMessage);
		*/
		
		User user = new User();
		user.setUsername("junil");
		user.setPassword("1234");
		
		Message<?> userMessage = new Message<User>(20, user);
		
		System.out.println("userMessage: " + userMessage);
	}

}
