package hackerrank;

import java.util.Scanner;

public class TheLongestCommonSubsequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			arr2[i] = in.nextInt();
		}
		
		int[][] dp = new int[n + 1][m + 1];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (arr1[i] == arr2[j]) {
					dp[i][j] = dp[i + 1][j + 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
				}
			}
		}
		
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			} else if (dp[i + 1][j] >= dp[i][j + 1]) {
				i++;
			} else {
				j++;
			}
		}
	}
}
