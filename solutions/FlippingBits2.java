package hackerrank;

import java.util.Scanner;

public class FlippingBits2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++) {
	        long l = in.nextLong();
	        System.out.println(helper(l));
	    }
	}

	private static long helper(long l) {
	    return ~l - 0xFFFFFFFF00000000L;
	}
}
