package dev.nelon.algorithms.twopointers;

public class OneArrayOneDirection {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 2, 1};
		
		int slow = 0;
		
		for (int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != nums[slow]) {
				
				System.out.println("Before slow " + nums[slow]);
				System.out.println("Before fast " + nums[fast]);
				
				slow++;
				
				System.out.println("slow " + nums[slow]);
				System.out.println("fast " + nums[fast]);
				
				nums[slow] = nums[fast];
			}
		}
	}
}
