package java0425_class.part07;
/*
 * this : 객체 자신을 의미한다.
 * this.멤버변수;
 * this.메소드();
 * this( ); 생성자
 */
public class Product {
	String code;
	String pname;
	int cnt;

	public Product() {
		
	}
	
	public Product(String code, String pname, int cnt) {
		//멤버변수와 매개변수 이름이 같을 때 멤버변수에 this 키워드를 명시한다.
		this.code=code;
		this.pname=pname;
		this.cnt=cnt;
	}
	public void prn() {
		System.out.printf("%s %s %d\n",code,pname,cnt);
	}
	
	
}
