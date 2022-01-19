package javaex.api.objectclass.v1;

public class CloneTest {

	public static void main(String[] args) {
//		shallowCopyTest(); // 얕은복제
		deepCopyTest();
	}

	private static void deepCopyTest() {
		Scoreboard s1 = new Scoreboard(new int[] { 10, 20, 30, 40 });
		System.out.println("s1:" + s1);
		Scoreboard s2 = s1.getClone();
		System.out.println("s2:" + s2);
		// s2의 scores의 1번 인덱스를 변경
		s2.getScores()[1] = 100;
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		// '+s1의 scores 참조주소, s2.scores 참조 주소
		System.out.println("필드 참조 주소 비교 : " + (s1.getScores() == s2.getScores()));
	}
	
	
}
