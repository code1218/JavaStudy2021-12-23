package a04_연산자;

/**
 * 
 * @author ITPS
 *	클래스의 사용설명서
 *
 * 논리연산자
 * AND: 곱
 * true(1) && true(1) -> true(1)
 * true && false -> false
 * false && false -> false
 * 
 * 
 * OR: 합
 * true || true -> true
 * true || false -> true
 * false || false -> false
 * 
 * 
 * NOT: 반전, 부정
 * !true -> false
 * !(true || false) -> false
 *
 */

public class Operation2 {
	/**
	 * 
	 * @param args
	 * 메소드의 설명
	 * 
	 */
	public static void main(String[] args) {
		// 한줄주석
		/*
		 * 여러줄 주석
		 * 
		 *
		/*
		안녕
		하세요
		반갑습니다
		*/
		
		boolean trueFalse = (5>3) && (3<1);
		System.out.println(!trueFalse);
	}
}
