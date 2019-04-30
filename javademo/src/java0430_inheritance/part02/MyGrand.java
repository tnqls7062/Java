package java0430_inheritance.part02;

public class MyGrand{
	public MyGrand() { //7
		System.out.println("MyGrand"); //8
	}//9
}
	class MyFather extends MyGrand{
		//자식 생성자에서는 반드시 부모생성자를 호출해야한다.
		//부모생성자 호출이 생략되어 있으면 JVM에서 super()로 호출한다.
		public MyFather() { //5
			super();//6
			System.out.println("MyFather"); //10
		}
	}

	class MyChild extends MyFather{
		public MyChild() { //3
			super(); //4 this:자신 super:부모
			System.out.println("MyChild");
		}
	}

