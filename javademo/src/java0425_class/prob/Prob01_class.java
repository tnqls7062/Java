package java0425_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 * [분석]
 * 이름    피자  자바
 * 면적    314.0 12.56
 */

class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수

	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius;
	}
	
	
}// end class////////////////////////

public class Prob01_class {

	public static void main(String[] args) {
		Circle ne=new Circle() ;
		ne.name="피자";
	    ne.radius=10;
		
		
		Circle sz=new Circle();
		sz.name="도넛";
	    sz.radius=2;
		
	    System.out.printf("자바%s의 면적은%s\n",ne.name,ne.getArea());
		System.out.printf("자바%s의 면적은%s\n",sz.name,sz.getArea());
		

	}//end main()

}//end class
