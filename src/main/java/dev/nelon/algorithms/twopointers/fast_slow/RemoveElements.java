package dev.nelon.algorithms.twopointers.fast_slow;

import java.util.Arrays;

public class RemoveElements {
	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		System.out.println(removeElement(nums, 2));
	}

	public static int removeElement(int[] nums, int val) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			if (nums[left] == val) {
				nums[left] = nums[right];
				right--;
			} else {
				left++;
			}
		}

		System.out.println(Arrays.toString(nums));
		return left;
	}
}
