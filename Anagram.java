package hackerrank;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < n; i++) {
			String s = in.nextLine();
			if (s.length() % 2 != 0) {
				System.out.println(-1);
				continue;
			}
			int[] ar1 = new int[26];
			int[] ar2 = new int[26];
			for (int a = 0; a < s.length() / 2; a++) {
				ar1[s.charAt(a) - 'a']++;
			}
			for (int b = s.length() / 2; b < s.length(); b++) {
				ar2[s.charAt(b) - 'a']++;
			}
			int res = 0;
			for (int k = 0; k < 26; k++) {
				if (ar1[k] > ar2[k]) {
					res += (ar1[k] - ar2[k]);
				}
			}
			System.out.println(res);
		}
	}
}
