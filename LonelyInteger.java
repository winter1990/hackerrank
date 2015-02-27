package hackerrank;

import java.util.Scanner;

public class LonelyInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int res = 0;
		for (int i = 0; i < n; i++) {
			res ^= in.nextInt();
		}
		System.out.print(res);
	}
}
