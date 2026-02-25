package dev.nelon.algorithms.twopointers.converging_pointers;

public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		
		System.out.println(isPalindrome(s));
	}
	
	private static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char l = s.charAt(left);
			char r = s.charAt(right);
			
			if (!Character.isLetterOrDigit(l)) {
				left++;
			} else if (!Character.isLetterOrDigit(r)) {
				right--;
			} else {
				if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
					return false;
				}
				left++;
				right--;
			}
		}
		
		return true;
	}
}
