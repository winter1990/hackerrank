package hackerrank;

import java.util.Scanner;

// hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh

public class PalindromeIndex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < n; i++) {
			String s = in.nextLine().trim();
			System.out.println(palindrome(s.toCharArray()));
		}
	}
	
	private static int palindrome(char[] cs) {
		int s = 0;
		int e = cs.length - 1;
		while (s < e) {
			if (cs[s] == cs[e]) {
				s++;
				e--;
			} else {
				if (cs[s + 1] == cs[e]) {
					if (isPalindrome(cs, s + 1, e)) {
						return s;
					}
				} 
				if (cs[s] == cs[e - 1]) {
					if (isPalindrome(cs, s, e - 1)) {
						return e;
					}
				} 
				return -1;
			}
		}
		return -1;
	}
	
	private static boolean isPalindrome(char[] cs, int s, int e) {
		while (s < e) {
			if (cs[s] != cs[e]) {
				return false;
			}
			s++;
			e--;
		}
		return true;
    }
}
