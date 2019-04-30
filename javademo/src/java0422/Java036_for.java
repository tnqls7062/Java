package java0422;
/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */

//행4 열5
//행 초기값 1 종료값 5 증가값 1

public class Java036_for {

	public static void main(String[] args) {
		/*
		 * for (int row = 1; row <= 5; row++) { 
		 * for(int ho=1; ho<5; row++) {
		 * System.out.printf("%4d",ho); }
		 * 
		 * if (row % 5 == 0) {
		 * 
		 * } System.out.println(); }
		 */
		int cnt;
		for (int row = 1; row <= 4; row++) {
			cnt = 1;
			for (int col = 1; col <= 5; col++) {
				System.out.printf("%4d", cnt);
				if (col >= 5) {
					System.out.printf("\n");
				}
				cnt++;

			}

		}
	}// end main()

}// end class
