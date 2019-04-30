package java0423_array;

public class Java048_array {

	public static void main(String[] args) {
		// 3행 2열
		int[][] num = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("%4d", num[i][j]);
			}
			System.out.printf("\n");
		}
	}// end main()

}// end class
