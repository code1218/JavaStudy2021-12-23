package a17_기본클래스;

public class Main {

	public static void main(String[] args) {
		ObjectEx objectEx = new ObjectEx();
		ObjectEx objectEx2 = new ObjectEx();
		ObjectEx objectEx3 = objectEx;
		objectEx.setUsername("junil");
		objectEx.setPassword("1234");
		objectEx2.setUsername("junil2");
		objectEx2.setPassword("1234");
		
		System.out.println(objectEx);
		
		System.out.println(objectEx.equals(objectEx2));
		
		
	}

}
