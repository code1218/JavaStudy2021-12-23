package a09_메소드;

public class MethodEx {
	// 매개변수 x, 반환값 x
	public static void printInfo() {
		System.out.println("김");
		System.out.println("준");
		System.out.println("일");
		System.out.println("입");
		System.out.println("니");
		System.out.println("다");
	}
	
	// 매개변수 o, 반환값 x
	public static void printName(String name) {
		System.out.println("이름: " + name);
	}

	// 매개변수 x, 반환값 o
	public static String getName() {
		String name = "김준일";
		return name;
	}
	
	// 매개변수 o, 반환값 o
	public static String transferName(String name) {
		String tName = name + "님";
		return tName;
	}
	
	public static String transferName2(String name, int number) {
		return number + "번 고객: " + name;
	}
	
	public static void main(String[] args) {
		printInfo();
		
		System.out.println("프로그램 종료");
		
		String name = "김준일";
		printName(name);
		
		String name2 = getName();
		System.out.println(name2);
		System.out.println(getName());
		
		String name3 = transferName("김준일");
		System.out.println(name3);
		System.out.println(transferName("김준일"));
		
		System.out.println(transferName2("김준일", 1));
	}

}
