package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified2 {
	static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        BigInteger r = fibonacciModified(a, b, n);
        System.out.println(r);
        /* also correct answer
        Scanner in = new Scanner(System.in);
	    BigInteger a = new BigInteger(in.next());
	    BigInteger b = new BigInteger(in.next());
	    int n = in.nextInt();
	    BigInteger res = new BigInteger("-1");
	    for (int j = 3; j <= n; j++) {
	      res = b.multiply(b).add(a);
	      a = b;
	      b = res;
	    }
	    System.out.println(res);
        */
    }

    private static BigInteger fibonacciModified(long a, long b, int n) {
        BigInteger[] dp = new BigInteger[n + 1];
        dp[1] = BigInteger.valueOf(a);
        dp[2] = BigInteger.valueOf(b);

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1].multiply(dp[i-1]).add(dp[i-2]);
        }

        return dp[n];
    }
}
