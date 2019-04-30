package java0423_array;

public class Java042_array {

	public static void main(String[] args) {
		//배열을 생성할 때 초기값을 할당하면 배열의 크기를 지정할 수 없다.
		int[] jumsu = new int[] {90,80,40};


for (int index=0; index<jumsu.length; index++) {
	System.out.printf("jumsu[d%]=%d\n",index,jumsu[index]);
}
/*
System.out.println("========================");
System.out.printf("jumsu[%d]=%d\n",2,jumsu[2]);
System.out.printf("jumsu[%d]=%d\n",2,jumsu[1]);
System.out.printf("jumsu[%d]=%d\n",2,jumsu[0]);*/

for(int index=jumsu.length-1; index>=0;index--) {
	System.out.printf("jumsu[]d%=%d\n",index,jumsu[1]);
}
	
	}//end main()
}//end class
