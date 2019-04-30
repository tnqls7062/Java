package java0419_statement;

/*
 * if 안에 if
 * if(조건식1){
 *  if(조건식2){
 *     수행할문장; // 조건식 1과 조건식 2를 모두 만족할 때 수행
 * }else {
 *     수행할문장; // 조건식 1은 만족하고 조건식 2는 만족하지 않을 때 수행
 *  }
 * }else{
 *     수행할문장; //조건식 1을 만족하지 않을 때 수행
 * }
 */
public class Java019_if {

	public static void main(String[] args) {
		//boolean member = true; //회원 or 비회원
		boolean member = false;
		String grade= "일반"; //회원등급: vip,일반
		//회원이고 vip고객이면 30%적립, 회원이고 vip고객이 아닐때는 10%적립
		//비회원이면 적립금이 없음
		
		//회원이면...
		if(member) {
			if(grade=="vip") { //회원이면서 vip
				System.out.println("30%적립");
		}else { //회원이지만 일반
				System.out.println("10%적립");
			}
		}else { //비회원이면...
			System.out.println("비회원");
		}
		System.out.println("고객님 감사합니다.");
	

	}//end main()

}//end class
