package java0426_class.part07;
/*
 * 오버로딩(overloading)
 * 1.하나의 클래스에 같은 이름의 메서드를 여러개 정의 하는 것을 오버로딩이라한다.
 * 2. 오버로딩의 조건
 * 1) 메서드이 이름이 같아야 한다.
 * 2) 매개변수의 갯수 또는 데이터 타입이 달라야한다.
 * 3) 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 어립되지 않는다.
 *  	(즉 리턴 타입은 오버로딩을 구현하는데 아무런 영향을 주지 않는다.)
 *  
 *  
 *  
 *  
 */
//오버로딩 
public class Calulator {
	void addValue(int x, int y) {
		System.out.println(x+y);
	}
	
	
	void addValue(int x, int y , int z ) {
		System.out.println(x+y+z);
	}
	
	
	
	void addValue(double x, double y) {
		System.out.println(x+y);
	}
}








