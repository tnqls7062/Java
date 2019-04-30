package java0419_statement;

/*
 * 조건식을 만족할 때만 수행할 문장이 있는 경우
 * if(조건식){
 *  수행할 문장;
 * }
 */
public class Java018_if {

	public static void main(String[] args) {
		//int num = 10; //2
		int num= -4; //b
		
		if (num > 0) { 
			System.out.printf("%d는 자연수 입니다.", num);
		}
		
		System.out.printf("program end");
		
	}//end main()
}//end class
