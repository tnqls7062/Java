package java0423_array;

public class Java051_array {

	public static void main(String[] args) {
		//가변 배열을 생설할 때는 제일 마지막의 배열크기는 지정하지 않는다!!!
		/*int[][] num=new int[3][];
		num[0]=new int[2]; //0행 2열
		num[1]=new int[3]; //1행 3열
		num[2]=new int[4]; //2행 4열
		*/

		int[][] num = new int[][] {{1,2},{3,4,5},{6,7,8,9}};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			}System.out.println();
		}
		
	}//end main()

}//end class
