package java0425_class.part02;

public class Java066_class {

	public static void main(String[] args) {
		Book bk =new Book();
		bk.title="칼의노래";
		bk.state=false;
		
		Book bs =new Book();
		bs.title="어두운 상점의 거리";
		bs.state=true;
		
		System.out.printf("%s,%s\n",bk.title,bk.process());
		System.out.printf("%s,%s\n",bs.title,bs.process());

	}//end main()
}//end class
