package java0418_basic.prob;

/*
 *평년,윤년을 구하는 프로그램을 구현하시오.
 *1 윤년의 조건
 * 1) 년도를 4로 나눈나머지가 0이고 100로 나눈 나머지가 0이 아니다. &&
 * 2) 년도를 400로 나눈 나머지가 0이다. ||
 * 
 * 2 [출력결과]
 *   2012년도는 윤년입니다
 */   
public class Prob06 {

	public static void main(String[] args){
		int year=2012;
		String leapYear="";
		
		leapYear = year%4==0 && year%100!=0 || year%400==0 ? year+"년도는 윤년입니다" : year+"년도는 윤년이 아닙니다";
		System.out.println(leapYear);
		
	}//end main()

}//end class












