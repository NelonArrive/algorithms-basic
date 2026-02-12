package dev.nelon.algorithms.twopointers.converging_pointers;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 6, 8, 9, 1, 5, 23, 45, 54};
		int target = 10;
		
		int left = 0;
		int right = nums.length - 1; // 5
		
		while (left < right) {
			int sum = nums[left] + nums[right]; // 10
			
			if (sum == target) {
				System.out.println(left + " : " + right);
				break;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
	}
}