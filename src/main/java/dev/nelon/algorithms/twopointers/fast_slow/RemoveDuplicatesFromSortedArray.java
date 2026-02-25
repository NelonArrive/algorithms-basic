package dev.nelon.algorithms.twopointers.fast_slow;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int left = 0; // slow pointer (последний уникальный)
		for (int right = 1; right < nums.length; right++) { // fast pointer
			if (nums[left] != nums[right]) {
				left++;
				nums[left] = nums[right];
			}
		}
		return left + 1;
	}
}
