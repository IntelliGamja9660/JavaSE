package section07;
/*
 * 3. 정적(static)/동적 변수
 *   정적 - static 예약어로 선언
 *   	모든 객체가 공유하는 변수
 *   	클래스명으로 접근 가능하다
 *   	객체 생성 없이 불러올 수 있다.
 * 
 * 
 */
public class Var02 {
	
	public static void main(String[] args) {
		
		System.out.println("Card.width: " + Card.width);
		System.out.println("Card.height: " + Card.height);
//		System.out.println("Card.type: " + Card.type);
//		System.out.println("Card.num: " + Card.num);
	
		Card card1 = new Card();
		Card card2 = new Card();
		
		System.out.println("=====card1=====");
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 num: " + card1.num);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);

		
		System.out.println("=====card2=====");
		System.out.println("card2 type: " + card1.type);
		System.out.println("card2 num: " + card1.num);
		System.out.println("card2 width: " + card1.width);
		System.out.println("card2 height: " + card1.height);
		
		System.out.println("=================================");
		
		card1.num = "K";
		
		System.out.println("=====card1=====");
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 num: " + card1.num);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);

		
		System.out.println("=====card2=====");
		System.out.println("card2 type: " + card1.type);
		System.out.println("card2 num: " + card1.num);
		System.out.println("card2 width: " + card1.width);
		System.out.println("card2 height: " + card1.height);
	}

}
