package java0418_basic;

public class Java008_operator {
	public static void main(String[] args) {
		int x = 3;
		
		//증가연산자 - 변수의 값을 1증가한다.
		++x; //x=x+1;
		System.out.println("x=" + x);
		
		int y=5;
		//감소연산자 - 변수의 값을 1 감소한다.
		--y; //y=y-1;
		System.out.println("y=" + y);
		
		//상수: 한번만 저장할 수 있는 메모리 공간
		final int NUM=4;
		System.out.println("NUM" + NUM);
		
		//상수의 값을 변경할 수 없다. 그러므로 증감연산자 사용을 할 수 없다.
		//NUM++;
		
		
	}// end main()
}// end class

