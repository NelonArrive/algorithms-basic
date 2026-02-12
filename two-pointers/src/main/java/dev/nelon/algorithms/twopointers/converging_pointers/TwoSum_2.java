package dev.nelon.algorithms.twopointers.converging_pointers;

import java.util.Arrays;

public class TwoSum_2 {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;
		
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			
			if (sum == target) {
				return new int[]{left + 1, right + 1};
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		
		return new int[]{-1, -1};
	}
}
