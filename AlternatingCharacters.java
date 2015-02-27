package hackerrank;

import java.util.Scanner;

public class AlternatingCharacters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String str = in.next();
			int s = 0;
			int e = 1;
			int count = 0;
			while (e < str.length()) {
				while (e < str.length() && str.charAt(s) == str.charAt(e)) {
					e++;
					count++;
				}
				s = e;
				e++;
			}
			System.out.println(count);
		}
	}
}
