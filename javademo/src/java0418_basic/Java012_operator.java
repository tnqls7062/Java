package java0418_basic;

public class Java012_operator {

	public static void main(String[] args) {
		int a =3;
		int b =5;
		int c =7;
		
		// &&연산자의 좌변이 false 이면 우변은 수행하지 않는다.
		boolean res = (++a > b) && (++b < c);
		System.out.println("a=" + a); //a=4
		System.out.println("b=" + b); //b=5
		System.out.println("res=" + res); //false
 
		int x = 4;
		int y = 8;
		int z = 10;
		// ||연산자의 좌변이 true이면 우변은 수행하지 않는다.
		//res = (z > ++y) || (++x > y);
		
		/*
		 * x>y => false
		 * && => false
		 * ++x => 5
		 * x==y => false
		 * || => false
		 */
		//res=x > y && ++y < z || ++x == y;
		
		//res = x > y || ++y < z && ++x == y;
		
		//res = ++y <z || ++y==z && ++y==z;
		//res=x>y && ++y<z || ++x==y;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("res=" + res);
		
	}//end main()

}//end class
