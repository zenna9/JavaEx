package ArraysEx;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx2 {

	public static void main(String[] args) {
		basicSortTest();
		basicSortDescTest();
	}

	// 기본 타입 정렬
	private static void basicSortTest() {
		int[] scores = { 80, 50, 30, 90, 75, 85, 77};
		System.out.println("scores : "+ Arrays.toString(scores));
		//오름차순 정렬
		Arrays.sort(scores);
		System.out.println("scores오름 : "+ Arrays.toString(scores));
	}
	//내림차순 정렬
	private static void basicSortDescTest() {
		Integer [] scores = { 80, 50, 30, 90, 75, 85, 77};
		Arrays.sort(scores, Collections.reverseOrder());
		//'-sort 는 기본 클래스가 아님. CompareTo클래스를 사용. 노션참고
		// '-- 그래서 데이터 타입을 포장 class로 감싸줘야한댕.. 
		// '--- 그래서 int[] scores는 안되고 Integer scores로 해야함, 
		// '----객체화 시키기 위해
		System.out.println("scores내림 : "+ Arrays.toString(scores));
		
	}
}
