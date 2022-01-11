package a08_반복;

public class Foreach {
	public static void main(String[] args) {
		String[] strArray = {"김준일", "김준이", "김준삼", "김준사"};
		int[] numArray = {1,2,3,4,5,6,7,8,9};
		
		// 일반 for문
		for(int i = 2; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		for(int i = 2; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		// foreach문
		for(String str : strArray) {
			System.out.println(str);
		}
		
		for(int num : numArray) {
			System.out.println(num);
		}
	}
}
