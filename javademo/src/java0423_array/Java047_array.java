package java0423_array;

public class Java047_array {

	public static void main(String[] args) {
		// 3행 2열의 2차원 배열
		int[][] num = new int[3][2];

		System.out.printf("%4d", num[0][0]);
		System.out.printf("%4d\n", num[0][1]);
		System.out.printf("%4d", num[1][0]);
		System.out.printf("%4d\n", num[1][1]);
		System.out.printf("%4d", num[2][0]);
		System.out.printf("%4d\n", num[2][1]);

		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;

		// num.length : 2차원 배열에서 행의 크기를 리턴
		// num[row].length : 2차원에서 열의 크기를 리턴

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col <= 1; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.printf("\n");
		}
		System.out.println("//////////////////////");
		/*
		 * 1 3 5 2 4 6
		 */

		// num[0][0] num[1][0] num[2][0]
		// num[0][1] num[1][1] num[2][1]
		/*
		 * for (int i = 0; i < 2; i++) { for (int j = 0; j <= 2; j++) {
		 * System.out.printf("%4d", num[j][i]); } System.out.printf("\n");
		 * 
		 * }
		 */
		int row = 0;
		for (int col = 0; col < num[row - col].length; col++) {
			for (row = 0; row < num.length; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.printf("\n");
		}
	}// end main()

}// end class
