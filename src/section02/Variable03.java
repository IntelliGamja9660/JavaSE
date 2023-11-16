package section02;
/*
 * 3. 정수형
 * byte	(1 byte) : -128 ~ +127
 * short(2 byte) : -32,768 ~ +32,767
 * int	(4 byte) : -2,147,483,648 ~ +2,147,483,647
 * long	(8 byte) : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
 */

public class Variable03 {
	public static void main(String[] args) {
		byte num1 = -128;
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		
		// Ctrl + s -> 저장
		// Ctrl + Shift + s -> 전체 파일 저장
		// Ctrl + Shift + l -> 단축키 목록
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		num1 += -1;		// num1 = num1 + 108;
		System.out.println(num1);
	
	}

}
