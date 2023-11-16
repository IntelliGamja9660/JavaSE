package section01;

public class Comment {
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		
		area(10);  // area 메서드 호출
	
	}
	/**JavaDoc 주석
	 * 
	 * 원의 넓이를 구하는 메서드
	 * 
	 * @param r - 반지름
	 */
	public static void area(int r) {
		// 원의 넓이 원주율 X 반지름 제곱
		double area = Math.PI*Math.pow(r, 2);
		System.out.println("원의 넓이: "+ area);
	}

}
