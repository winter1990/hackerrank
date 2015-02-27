package hackerrank;

import java.math.BigInteger;
import java.util.*;

public class ACMICPCTeam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] strs = in.nextLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int m = Integer.parseInt(strs[1]);
		
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextLine();
		}
		
		int maxValue = 0;
		int maxCount = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int count = helper(arr[i], arr[j], m);
				if (count == maxValue) {
					maxCount++;
				} else if (count > maxValue) {
					maxCount = 1;
					maxValue = count;
				}
			}
		}
		System.out.println(maxValue);
		System.out.println(maxCount);
	}
	
	private static int helper(String p, String q, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (p.charAt(i) == '1' || q.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
}
		/* wrong answer
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = Integer.parseInt(s.split(" ")[0]);
		int m = Integer.parseInt(s.split(" ")[1]);
		
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = in.nextLine();
		}
		int max = 0;
		List<Entry> res = new ArrayList<Entry>();
		for (int i = 0; i < n - 1; i++) {
			int v1 = new BigInteger(str[i], 2).intValue();
			for (int j = i + 1; j < n; j++) {
				int v2 = new BigInteger(str[j], 2).intValue();
				int cur = v1 | v2;
				//System.out.println("cur=" + cur);
				if (cur == max) {
					res.add(new Entry(v1, v2));
				} else if (cur > max) {
					max = cur;
					Entry p = new Entry(v1, v2);
					res = new ArrayList<Entry>();
					res.add(p);
				} else {
					continue;
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < m; i++) {
			if (((max >> i) & 1) == 1) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(res.size());
	}
}

class Entry {
	int x;
	int y;
	public Entry(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
*/