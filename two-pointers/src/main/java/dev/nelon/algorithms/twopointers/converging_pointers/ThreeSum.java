package dev.nelon.algorithms.twopointers.converging_pointers;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};

		List<List<Integer>> res = threeSum(nums);

		System.out.println(res);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		// 1. Сортируем массив
		Arrays.sort(nums);

		int n = nums.length;

		// 2. Фиксируем первый элемент
		for (int i = 0; i < n - 2; i++) {

			// Пропускаем дубликаты для i
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = n - 1;

			// 3. Two pointers
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					// Нашли валидную тройку
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					left++;
					right--;

					// Пропускаем дубликаты слева
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}

					// Пропускаем дубликаты справа
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}

				} else if (sum < 0) {
					// Сумма слишком маленькая — увеличиваем
					left++;
				} else {
					// Сумма слишком большая — уменьшаем
					right--;
				}
			}
		}

		return result;
	}


}
