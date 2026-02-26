package dev.nelon.algorithms.slidingwindow.fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
	public static void main(String[] args) {
		System.out.println(findAnagrams("cbaebabacd", "abc"));
	}

	public static List<Integer> findAnagrams(String s, String p) {
		int[] pCount = new int[26];
		int[] sCount = new int[26];
		List<Integer> result = new ArrayList<>();

		// Count frequency of characters in p
		for (char c : p.toCharArray()) {
			pCount[c - 'a']++;
		}

		// Sliding window to count frequency of characters in s
		for (int i = 0; i < s.length(); i++) {
			sCount[s.charAt(i) - 'a']++;

			// Remove the character that is out of the window
			if (i >= p.length()) {
				sCount[s.charAt(i - p.length()) - 'a']--;
			}

			if (Arrays.equals(pCount, sCount)) {
				result.add(i - p.length() + 1);
			}
		}
		return result;
	}
}

//	Time complexity: O(n)
//	Space complexity: O(1)