package java0430_inheritance.part05;

/*
 * 오버라이딩(overriding)
 * 1. 조상클래스의 메소드를 자식(손) 클래스에서 재정의(메소드 구현부)하는 기능이다.
 * 2. 오버라이딩 성립요건
 *    1) 부모 클래스의 메소드와 메소드 이름이 동일해야한다.
 *    2) 매개변수의 타입, 갯수, 순서가 일치해야한다. //메소드 선언부는 같아야한다. 그리고 접근 제어자는 더 넓어도 된다.
 *    3) 리턴타입이 동일해야한다. //선언부
 *    4) 접근제한(어)자는 부모클래스의 메소드와 같거나 더 넓은 범위어야 한다.
 *       private < default < protected < public
 *    5) 예외 발생시 같은 예외 형식이거나, 더 구체적인 예외 형식이어야 한다.
 *   
 *   super : 부모 객체를 의미함
 *   1. 자손클래스에서 조상클래스를 호출할 때 사용한다.
 *   2. super.멤버변수
 *      super.메소드
 *      super() => 생성자
 *      
 *      단일클래스                           상속관계의 자손클래스
 *      overloading    vs    overriding
 *      this           vs    super
 */
public class First {
	int a = 10;

	void prn() {
		System.out.println("a=" + a);
	}

}// end First class

class Second extends First {
	int b = 20;

	// annotation(어노테이션)
	// @Override
	void prn() {
		System.out.println("b=" + b);
	}

	public void superThisMethod() {
		super.prn();
		this.prn();
	}

	public static void display() {
//static이 선언되어있으면 안댐		
		//super.prn();
		//this.prn();

	}
}// end Second class
