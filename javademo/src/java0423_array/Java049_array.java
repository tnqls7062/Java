package java0423_array;

/*[데이타]
 * 홍길동 90 85 40
 * 갑동이 100 35 75
 * 
 * [출력결과]
 * 홍길동 90 85 40 215 71.7
 * 갑동이 100 35 75 210 70.0
 */
public class Java049_array {

	public static void main(String[] args) {
		String[] name = new String[] { "홍길동", "길동이" };
		int[][] num = new int[][] { { 90, 85, 40 }, { 100, 35, 75 } };

		for (int i = 0; i < 2; i++) {
			System.out.printf("%s", name[i]);
			int sum = 0;

			for (int j = 0; j < 3; j++) {
				System.out.printf("%4d", num[i][j]);
				sum += num[i][j];
			}
			System.out.printf("%5d %5.1f", sum, (double) sum / 3);
			System.out.println();
		}

	}

}
