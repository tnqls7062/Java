package java0424_method;
/*
 * method(메소드) 정의
 * 1 값을 계산하기 위해서 사용되는 기능이다.
 * 2 객체의 동작을 처리하기 위한 기능이다.
 * 
 * method 구조형태 : 메소드 선언부 + 메소드 구현부
 * 반환자료형 메소드명(데이터 타입 매개 변수) => 메소드 선언부
 * {
 * =>메소드 구현부
 * : 메소드가 처리해야할 로직 구현;
 * return 값;
 * }
 * 
 * 1.리턴값이 없고 매개변수도 없다.
 *   void add(){
 *      int x=10;
 *      int y=20;
 *      if (y>30){
 *        return;
 *      }
 *      System.out.println(x+y);
 *   }
 *   
 *   add( ); => 호출
 *   
 * 2.리턴값은 없지만 매개변수는 있다.
 *   void plus(int x, int y){
 *    System.out.println(x+y);
 *   }
 *   
 *   plus(10,20); => 호출
 *   
 * 3.리턴값은 있지만 매개변수는 없다.
 *   double avg(){
 *     int total =15;
 *     return total/3.0;
 *   }
 *   
 *   double res=avg(); => 호출
 *   System.out.println(res);
 *   
 *   System.out.println(avg()) (o)
 *   System.out.println(plus((10,20)); (x)
 *   
 *   4.리턴값도 있고 매개변수도 있다.
 *   double avg(int x, int y){
 *     return (x+y)/2,0;
 *   }
 *   
 *   double res=avg(10,20);
 *   System.out.println(res);
 */

public class Java052_method {

	// 프로그램을 실행하면JVM(자바 가상머신-Java Virtual Machine)에서
	// main스레드가 main( ) 메소드를 호출한다.

	public static void main(String[] args) { // 1
		System.out.println("main start"); // 2
		// makeTest()메소드 호출(call)
		makeTest(); // 3
		System.out.println("main end"); // 7
	}// end main() //8

	public static void makeTest() { // 4
		System.out.println("makeTest run"); // 5

	}// end makeTest() //6
}// end class
