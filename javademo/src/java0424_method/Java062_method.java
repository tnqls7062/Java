package java0424_method;
/*
    [출력결과]
	입사총점:815점
	입사결과:합격입니다
	*/
public class Java062_method {

	public static int total(int toeic, int it) {
		
		return toeic + it;
		
	}//end total()
	
	public static String rs(int tot) {
		//총점이 800이상이면 합격, 미만이면 불합격
        if(tot>800) {
        	return "합격";
        }	else {
		return "불합격";
        }
	}//end rs()
	
	public static void main(String[] args) {
		int toeic=750, it=65;
		int sum=total(toeic,it);
		System.out.println("입사총점:" + sum + "점");
		System.out.println("입사결과:" + rs(sum) + "입니다");

	}//end main()

}//end class
