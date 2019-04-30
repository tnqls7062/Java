package java0425_class.part03;

/*
 * [사각형 도형]
 * 가로          세로          넓이를 구한다          둘레를 구한다
 * 5       3      15            16
 * 7       4      28            22
 */
/*
 * [객체모델링 과정]
 * 객체의 특징: 가로, 세로
 * 객체의 기능: 넓이를 구한다. 둘레를 구한다.
 */

public class Rect {
	int width; // 가로
	int height; // 세로

	//넓이를 구하는 메소드
	int area() {
		return width*height;
	}
	int grith() {
		return (width+height)*2;
	}
	
	void prn() {
		System.out.printf("[가로%d, 세로%d의 사각형]\n", width,height);
		System.out.printf("넓이:%d\n",area());
		System.out.printf("둘레:%d\n",grith());
	}
}// end class
