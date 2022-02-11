package a15_무명클래스;

/**
 * 
 * 무명, 익명 클래스
 *
 */
class Test extends AnonymousClass {
	@Override
	public void showInfo() {
		System.out.println("test입니다.");
	}
}

public class Main {

	public static void main(String[] args) {
		AnonymousClass anonymousClass = new AnonymousClass() {
			@Override
			public void showInfo() {
				System.out.println("test1입니다.");
			}
		};
		
		AnonymousClass anonymousClass2 = new AnonymousClass() {
			
			@Override
			public void showInfo() {
				System.out.println("test2입니다.");
			}
		};
		
		anonymousClass.showInfo();
		anonymousClass2.showInfo();
		
		Test test1 = new Test();
		Test test2 = new Test();
		Test test3 = new Test();
		Test test4 = new Test();
		Test test5 = new Test();
		
		
		
	}

}
