package java0418_basic;
/*
 *리터널(linteral) : 그 자체의 값(1,2,3,...'a','b','c'...,true,false)
 *변수(variable) : 하나의 값을 저장하기 위한 메모리 공간
 *데이터 타입(data type) : 값의 종류와 메모리 크기를 결정 
 *자바에서 제공하는 데이터 타입
 *1. 기본 데이터 타입(primitive data type)
 *  byte(1), short(2), int(4), long(8) =>정수
 *  float(4), double(8) =>실수
 *  boolean(1) =>논리
 *  char(2) =>문자
 *  
 *2. 참조 데이터 타입(reference data type)
 *  배열(array),클래스 (class), 인터페이스(interface)
 *  
 *  시스템에서 인식하는 데이터 타입 크기
 *  byte < short < char < int < long < float < double
 */

public class Java003_dataType {
	public static void main(String[] args) {
		// int : 정수값을 저장할 수 있는 4바이트 메모리를 생성한다.
		// data : 생성된 메모리를 관리해줄 수 있는 변수 할당
		// 3을 메모리에 할당한다.
		int data = 3; // 변수선언
		System.out.println(data);

		data = 10; // 변수에 10을 새로 할당한다.

		System.out.println(data);

		int num; // 4바이트 메모리 생성 후 변수 지정

		// 변수에 저장된 값을 호출하기 전에는 반드시 변수에 저장된 값이 있어야함.
		// System.out.println(num);

		num = 20; // num변수에 20할당(저장)

		System.out.println(num);

		long gnum = 3L; // 기호 L은 대소문자 구분없음
		byte bnum = 15;
		float fnum = 3.6F;

	}// end main()
}// end class
