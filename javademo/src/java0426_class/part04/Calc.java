package java0426_class.part04;

public class Calc {
int first;
int second;
char ope; //배열에 저장된 연산자는 +,-,*,/

public Calc() {
	
}
public Calc(int first,int second, char ope) {
	this.first = first;
	this.second = second;
	this.ope=ope;
}
public int process() {
	/*if (ope=='+') {
		return first+second;
	}else if (ope=='-') {
		return first-second;
	}else if (ope=='*') {
		return first*second;
	}else if(ope=='/') {
		return	first/second;
	}else 
		return 0;*/
	switch(ope) {
	case '+': 
		return first+second;
	case '-': 
		return first-second;
	case '*': 
		return first*second;
	default : 
		return first/second;
	}
	 
	
}//end process()

public void prn() {
	System.out.printf("%2d %c %2d = %d\n",first,ope,second,process());
}
}
