package ArraysEx;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		arrayCopyEx();
	}

	// 배열 복사
	private static void arrayCopyEx() {
		int[] nums = { 10, 20, 30, 40, 50 };
		// 배열 출력
		System.out.println("nums:" + nums);
		System.out.println("nums : "+ Arrays.toString(nums));
		
		//타겟배열에 nums 배열을 복사하기
		int target[] ;
		target =Arrays.copyOf(nums, nums.length);
		System.out.println("target : "+ Arrays.toString(target));
	
		//nums 배열의 일부(20, 30, 40) 복사
		int[] target2 = Arrays.copyOfRange(nums, 1, 4);
		System.out.println("target2 : "+ Arrays.toString(target2));
	
	
	
	}

}
