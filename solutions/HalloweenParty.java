package hackerrank;

import java.util.Scanner;

public class HalloweenParty {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int k;
		long res;
		for (int i = 0; i < n; i++) {
			k = in.nextInt();
			if (k <= 1) {
				System.out.println(0);
			}
			if (k % 2 == 0) {
				res = (k / 2) * (k / 2);
				System.out.println(res);
			} else {
				res = (k / 2) * (k / 2) + (k - 1) / 2;
				System.out.println(res);
			}
		}
    }
}
