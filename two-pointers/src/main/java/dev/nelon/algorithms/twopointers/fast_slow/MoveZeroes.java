package dev.nelon.algorithms.twopointers.fast_slow;

import java.util.Arrays;

public class MoveZeroes {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    System.out.println(Arrays.toString(moveZeroes(nums)));
  }

  public static int[] moveZeroes(int[] nums) {
    int left = 0;

    for (int rigth = 0; rigth < nums.length; rigth++) {
      if (nums[rigth] != 0) {
        int temp = nums[left];
        nums[left] = nums[rigth];
        nums[rigth] = temp;
        left++;
      }
    }

    return nums;
  }
}
