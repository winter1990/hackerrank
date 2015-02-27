package hackerrank;

import java.util.*;

public class TheLoveLetterMystery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> res = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			String s = in.next();
			char[] cs = s.toCharArray();
			int l = 0, r = s.length() - 1;
			int count = 0;
			while (l < r) {
				int diff = Math.abs(cs[l] - cs[r]);
				if (diff != 0) {
					count += diff;
				}
				l++;
				r--;
			}
			res.add(count);
		}
		
		for (Integer i : res) {
			System.out.println(i);
		}
	}
}
