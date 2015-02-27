package hackerrank;

import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] arr = new char[n][n];
		for (int i = 0; i < n; i++) {
			String s = in.next();
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				if (check(arr, i, j)) {
					arr[i][j] = 'X';
					j++;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	private static boolean check(char[][] arr, int i, int j) {
		if (arr[i][j] - '0' > arr[i - 1][j] - '0' &&
				arr[i][j] - '0' > arr[i + 1][j] - '0' &&
				arr[i][j] - '0' > arr[i][j - 1] - '0' &&
				arr[i][j] - '0' > arr[i][j + 1] - '0') {
			return true;
		}
		return false;
	}
}
