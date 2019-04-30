package java0423_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;
		int sum = 0;

		for (int i = 0; i < data.length - 1; i++) {
			sum = 0;
			for (int j = 0; j < data[i].length - 1; j++) {

				data[i][j] = cnt++;
				sum += data[i][j];
				if (data[i][j] % 3 == 0) {
					data[i][j + 1] = sum;

				}
				System.out.println();
			}

			for (int a = 0; a < data.length; a++) {
				int som = 0;
				for (int b = 0; b < data[a].length; b++) {

					if (data[b][a] == 0) {
						som += data[b][a];
					}
					System.out.printf("%4d", data[som][b]);
				}
				System.out.println();

			}
		}
	}// end main()

}// end class
