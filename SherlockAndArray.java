package hackerrank;

import java.util.*;

public class SherlockAndArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<String> res= new ArrayList<String>();
		for (int i = 0; i < t; i++) {
			int len = in.nextInt();
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = in.nextInt();
			}
			if (helper(arr, len)) {
				res.add("YES");
			} else {
				res.add("NO");
			}
		}
		for (String s : res) {
			System.out.println(s);
		}
		
	}
	
	private static boolean helper(int[] arr, int n) {
		if (n == 1) {
			return true;
		}
		int[] dp = new int[n];
		dp[0] = arr[0];
		for (int i = 1; i < n; i++) {
			dp[i] = dp[i - 1] + arr[i];
		}
		for (int i = 1; i < n - 1; i++) {
			if (dp[i - 1] == (dp[n - 1] - dp[i])) {
				return true;
			}
		}
		return false;
	}
}
