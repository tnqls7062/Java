package java0419_statement;
/*
 * 10+5=15
 * 10-5=5
 * 10*5=50
 * 10/5=2
 */
public class Java027_switch {
public static void main(String[] args) {
	char ope = '/';
	int numX = 10;
	int numY = 5;
	int res = 0;
	///////
	switch (ope) {
	case '+' : res=numX+numY; break;
	case '-' : res=numX-numY; break;
	case '*' : res=numX*numY; break;
	case '/' : res=numX/numY; 
	}
	///////
	System.out.printf("%d %c %d=%d\n", numX, ope, numY, res); 
}//end main()
}//end class
