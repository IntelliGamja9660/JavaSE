package section01;

public class Comment {
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		
		area(10);
	
	}
	public static void area(int r) {
		double area = Math.PI*Math.pow(r, 2);
		System.out.println("원의 넓이: "+ area);
	}

}
