package java0419_statement;
/*
 * 각월의 마지막일
 * 1 3 5 7 8 10 12 => 31
 * 4 6 9 11 => 30
 * 2 => 28
 * 
 * [출력결과]
 * 4월의 마지막 일은 30입니다.
 */
public class Java023_if {

	public static void main(String[] args) {
		int month = 13; //월
		int lastDay=-1; //마지막 일
		
		if (month<1 || month>12) {
			System.out.println("월은 1~12까지만 가능합니다.");
			return;
		}
		
		if (month ==2) {
			lastDay=28;
		}else if(month==4 || month==6 || month ==9 || month==11) {
			lastDay=30;
		}else {
			lastDay=31;
		}
		System.out.printf("%d월의 마지막 일은 %d입니다.\n",month,lastDay);
//지역변수는 기본값을 제공하지 않는다.
		
	}//end main()

}//end class
