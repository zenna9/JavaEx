package javaex.api.objectclass.v1;

public class langClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);

		// 자바의 최상 클래스는 Object.
		// 모든 클래스는 Object의 모든 메서드를 물려받음
		System.out.println(
				// getClass 함수 호출. class정보를 반환함
				p.getClass().getName());
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString()); // Point(10,20)
		System.out.println(p); // Point(10,20)

		System.out.println("==========");

		// 똑같은 값을 가진 새로운 포인트 만들기
		Point p2 = new Point(10, 20);
		System.out.println(p == p2); // false
		System.out.println(p.equals(p2)); // false 
		// 왜 false인가? :내부 필드값의 변화를 자바는 몰라서
		// -> equals Override 한 이후 true가 됨

	}

}
