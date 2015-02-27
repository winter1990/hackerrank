package hackerrank;

import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.toLowerCase();
		int len = s.length();
		int[] arr = new int[26];
		for (int i = 0; i < len; i++) {
			int v = s.charAt(i) - 'a';
			if (v >= 0 && v <= 26) {
				arr[v]++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] == 0) {
				System.out.print("not pangram");
				return;
			}
		}
		System.out.print("pangram");
	}
}
