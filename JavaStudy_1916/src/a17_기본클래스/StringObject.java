package a17_기본클래스;

import java.util.Scanner;

public class StringObject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name1 = "김준일";
		String name2 = "김준일";
		System.out.print("이름입력: ");
		String name3 = scanner.nextLine();
		String name4 = new String("김준일");
		
		System.out.println("name1, name2: " + (name1 == name2));
		System.out.println("name1, name3: " + (name1 == name3));
		System.out.println("name1, name3: " + (name1.equals(name4)));
	}

}
