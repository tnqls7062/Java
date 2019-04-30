package java0418_basic;
/*
 * [자동 형변환 정의]
 * 연산시 컴파일러가 자동으로 형을 변환하는 것을 의미하며,
 * 일반적으로 작은 데이터 타입에서 큰데이터 타입으로 변환될 때 자동형변환이 일어난다.
 * 
 * [기본 자료형 자동 형변환(묵시적 형변환)이 발생하는 경우]
 * 1. 작은데이터 타입에서 큰 데이터 타입으로는 자동 형변환이 가능하다.
 * 2. 정수형은 실수형으로 자동 형변환이 가능하다.
 * 3. char형은 int형으로 자동 형변환이 가능하다.
 */
public class Java004_casting {
public static void main(String[] args) {
	int x =3;
	double y = 4.5;
	
	//묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생
	y = 5;
	System.out.println(y);
	
	//명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생
	x=(int)2.6;
	System.out.println(x);
	
}//end main()
}//end class
