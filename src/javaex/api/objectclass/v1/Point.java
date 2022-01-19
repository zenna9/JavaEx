package javaex.api.objectclass.v1;

public class Point implements Cloneable {
	// field
	int x;
	int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toSting() 오버라이드 -> 덮어쓰기
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	// 필드값을 비교할 수 있도록 equals를 Override해줘야 함
	@Override
	public boolean equals(Object obj) {
		// 처음에는 equals(Object obj)로 돼있는데,
		// 인자 obj가 진짜 Point인지, 그래서 equals가 제대로 작동하는지
		// 확인해줘야 함
		if (obj instanceof Point) {
			Point other = (Point) obj;
			return this.x == other.x && this.y == other.y;
		}
		// super가 머냐 ? Object다!
		return super.equals(obj);
	}
	
	//복제본 생성 메서드
	public Point getClone() {
		Point clone = null;
		
		try {
			//'- try : 근데 파일, 네트워크, 복제 등의 작업은 에러가 많이 남. 그래서 에러가 나도 종료되지 않게 처리
			clone = (Point)clone();
			// '- clone 해서 나오는건 object type기 때문에 Point type로 변환
		} catch(CloneNotSupportedException e) {
			//예외가 발생하면 조치할 내용 : 지금은 그냥 에러 코드만 출력
			e.printStackTrace();
		}
		return clone;
	}

}
