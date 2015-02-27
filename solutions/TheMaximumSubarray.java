package hackerrank;

import java.util.*;

public class TheMaximumSubarray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < t; i++) {
			String s = "";
			int len = in.nextInt();
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = in.nextInt();
			}
			s = getMax(arr, len);
			res.add(s);
		}
		
		for (String s : res) {
			System.out.println(s);
		}
	}
	
	private static String getMax(int[] arr, int len) {
		String res = "";
		int maxContinuous = Integer.MIN_VALUE;
		int maxNonContinu = 0;
		int cur = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] > 0) {
				maxNonContinu += arr[i];
			}
			cur += arr[i];
			maxContinuous = Math.max(maxContinuous, cur);
			if (cur < 0) {
				cur = 0;
			}
			// maxContinuous = Math.max(maxContinuous, cur);
		}
		
		int m = Integer.MIN_VALUE;
		if (maxNonContinu == 0) {
			for (int i = 0; i < len; i++) {
				m = Math.max(arr[i], m);
			}
			maxNonContinu = m;
		}
		res = maxContinuous + " " + maxNonContinu;
		return res;
	}
}
