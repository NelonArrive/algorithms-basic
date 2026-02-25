package dev.nelon.algorithms.slidingwindow.dynamic;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		HashSet<Character> seen = new HashSet<>();
		int maxLength = 0;
		int left = 0;

		for (int right = 0; right < n; right++) {
			while (seen.contains(s.charAt(right))) {
				seen.remove(s.charAt(left));
				left++;
			}
			seen.add(s.charAt(right));
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}


}
