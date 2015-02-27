package hackerrank;

import java.util.*;
import java.util.Scanner;

public class CutSticks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				continue;
			}
			res.add(n - i);
			int val = arr[i];
			for (int j = i; j < n; j++) {
				arr[j] -= val;
			}
		}
		
		for (int i : res) {
			System.out.println(i);
		}
	}
}
