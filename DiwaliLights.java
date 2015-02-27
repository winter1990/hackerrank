package hackerrank;

import java.util.Scanner;

public class DiwaliLights {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			int p = in.nextInt();
			long res = 1;
			for (int j = 0; j < p; j++) {
				res = (res * 2) % 100000;
			}
			System.out.println(res - 1);
		}
	}
}
