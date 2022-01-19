package javaex.api.objectclass.v1;

public class langClassTest {

	public static void main(String[] args) {
		Point p= new Point(10,20);
		
		//자바의 최상 클래스는 Object.
		// 모든 클래스는 Object의 모든 메서드를 물려받음
		System.out.println(
				//getClass 함수 호출. class정보를 반환함
				p.getClass().getName());
		System.out.println(
				p.getClass().getName());
		System.out.println(
				p.hashCode());
		System.out.println(
				p.toString());
		System.out.println(p);

	}

}
