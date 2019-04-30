package java0424_method;

public class Java056_method {
public static void main(String[] args) {
	//stack 영역에 값이 저장-기본 데이터 타입
	int a=10,b =20;
	int c=a, d=b; // 값복사(call by value)
	
	//c,d변수의 값을 교환
	int temp=c;
	c=d;
	d=temp;
	System.out.printf("a=%d b=%d\n",a,b);
	System.out.printf("c=%d d=%d\n",c,d);
	
	System.out.println("//////////////////////////////");
	
	//stack 영역에 주소저장-참조 데이터 타입
	int[] num = new int[] {10,20};
	int[] arr = num; //주소복사(call by reference)
	
	int imsi=arr[0];
	arr[0]=arr[1];
	arr[1]=imsi;
	System.out.printf("num[0]=%d,num[1]=%d\n", num[0], num[1]);
	System.out.printf("arr[0]=%d,arr[1]=%d\n", arr[0], arr[1]);
   }//end main()
}//end class
