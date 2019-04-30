package java0423_array;

public class Java043_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] { 22, 3, 8, 12 };
		int sum = 0;
		
		/*
		sum=sum+num[0]; 
		sum=sum+num[1];
		sum=sum+num[2];
		sum=sum+num[3];*/
		
		for(int index=0; index<num.length; index++) {
			sum=sum+num[index];
		}
			
			System.out.println("합계:"+sum);
			
	}

}
