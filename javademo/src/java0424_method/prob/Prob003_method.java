package java0424_method.prob;

public class Prob003_method {
	public static void main(String[] args) {
		char[] arr = new char[] { 'j', 'a', 'v', 'a', '_', 'j', 's', 'p' };
		System.out.println(process(arr)); // java jsp

		char[] loc = new char[] { 's', 'e', 'o', 'u', 'l', '_', 'i', 'n', 'c', 'h', 'o', 'n' };
		System.out.println(process(loc));// seoul inchon

	}// end main()

	public static char[] process(char[] data) {
		char res []= new char [data.length]; {
				for (int i=0 ;i<data.length;i++) {
					if(data[i]=='_') {
						i=' ';
					}
				}System.out.println(res);
		}
		// data배열의 요소가 '_'이면 ' '으로 변경후 리턴하는
		// 프로그램을 구현하시오.
		
		return res;
	}// end process()

}// end class
