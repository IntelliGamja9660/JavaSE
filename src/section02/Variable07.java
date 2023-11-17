package section02;
/*
 * 형변환(cast)
 *  1. 업캐스팅
 *  	- 표현 범위가 큰 데이터형으로 변환하기
 *  	- 자동으로 가능
 *  	- 데이터 손실이 없다.
 *  2. 다운캐스팅
 *  	- 표현 범위가 더 작은 데이터형으로 변환하기
 *  	- 명시적으로 해야 한다.
 *  	- 데이터 손실이 있을 수 있다.
 * 
 */
public class Variable07 {
	
	public static void main(String[] args) {
		// 업캐스팅 예
		byte iByte = 10;
		int iInt = iByte; //	자동으로 형 변환
		System.out.println("iInt: " + iInt);
		
		float iFloat = 10.1f;
		double iDouble = iFloat;	// 자동으로 형 변환
		System.out.println("iDouble: " + iDouble);
		
		// 다운캐스팅 예
		int iInt2 = 130;
		//byte iByte2 = iInt2;	// 에러가 난다.
		byte iByte2 = (byte)iInt2;	// 강제 형 변환을 해줘야 한다!!
		System.out.println("iByte2: " + iByte2);// overflow가 일어난다.
		
		// 실수 -> 정수 형변환 예
		float iFloat2 = 3.1415f;
		int iInt3 = (int)iFloat2;	// 강제 형 변환 
		System.out.println("iInt3: " + iInt3); // 소수점 부분이 다 날아간다.
		
		
	}

}
