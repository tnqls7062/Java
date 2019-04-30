
package java0422;

/*
 * 1부터 10까지 짝수, 홀수누적을 계산하는 프로그램을 구현하세요.
 * [출력결과]
 * 짝수누적:30
 * 홀수누적:25
 */
public class Java033_for {
	public static void main(String[] args) {
		int i, odd = 0; // 홀수누적
		int even = 0; // 짝수누적
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) { //if (i%2==1)
				even = even + i;
			} else { 
				odd = odd + i;
			}
		}
		System.out.printf("짝수누적:%d\n홀수누적:%d\n", even, odd);
	}// end main()
}// end class
