package java0424_method;
/*
 * [출력결과]
 * 문자열의 길이:4
 * 2인덱스의 요소값 가져오기:v
 */
public class Java060_method {

	public static void main(String[] args) {
		char[] data=new char[] {'j','A','v','a'};
		int searchIndex=2;
		System.out.printf("문자열의 길이:%d\n",length(data));
		System.out.printf("%d 인덱스의 요소값을 가져오기 :%c\n",searchIndex,charAt(data,searchIndex));


	}//end main()
	public static int length(char[]data) {
	
		return data.length;
		
	}//end length()
	
	public static char charAt(char[] data, int index) {
		//data배열에서 index에 해당하는 문자를 리턴하는 프로그램을 구현하세요.
		
		return data[index];
	}//end charAt()

}//end class
