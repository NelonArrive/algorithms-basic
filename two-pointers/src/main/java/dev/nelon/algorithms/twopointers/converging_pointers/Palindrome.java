package dev.nelon.algorithms.twopointers.converging_pointers;

public class Palindrome {
	public static void main(String[] args) {
		String s = "азиза";
		
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				System.out.println("Not palindrome");
				break;
			}
			left++;
			right--;
		}
		
		System.out.println("Palindrome");
	}
}
