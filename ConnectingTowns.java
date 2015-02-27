package hackerrank;

import java.util.Scanner;

public class ConnectingTowns {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			int t = in.nextInt();
			long res = 1;
			for (int j = 1; j < t; j++) {
				res *= in.nextInt();
				res %= 1234567;
			}
			System.out.println(res);
		}
	}
}
