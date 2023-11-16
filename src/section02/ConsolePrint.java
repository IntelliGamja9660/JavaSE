package section02;
/*
 * 출력문
 *  데이터를 화면에 출력하는 방법
 *  
 *  System.out.println()	: 괄호 안 내용 출력 후 행 바꿈
 *  System.out.print()		: 괄호 안 내용 출력 행 바꿈 X
 *  System.out.printf()		: 문자열 서식 문자를 이용해 형식화된 내용 출력 행 바꿈 X 
 * 
 * 서식문자
 * %d : 정수(10진수)
 * %o : 정수(8진수)
 * %x : 정수(16진수)
 * %f : 실수
 * %s : 문자열 
 * %c : 문자
 * 
 * 자바에서 문자열은 "" 안에 들어가 있는 것
 * '' 안에 들어가 있는 것은 문자
 * => 한글 같은 경우에는?
 * 
 */
public class ConsolePrint {
	// 자바 프로그램 시작 메인 메서드
	public static void main(String[] args) {
		// print - 줄 바꿈 X
		System.out.print("Welcome.");
		// println - 줄 바꿈 O
		System.out.println("Java World!");
		// printf - 서식문자 이용해 형식화
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 11, 14);
		System.out.println("오늘은 "+ 11 +"월 "+14+"일 입니다.");
		System.out.printf("%d은 첫번째, %f은 두번째, %c은 세번째.", 1, 2.0, 'c');
	}
}
