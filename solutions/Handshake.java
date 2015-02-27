package hackerrank;

import java.util.Scanner;

public class Handshake {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long total;
		
		for (int i = 0; i < n; i++) {
			total = in.nextLong();
			long res = total * (total - 1) / 2;
			System.out.println(res);
		}
	}
}
