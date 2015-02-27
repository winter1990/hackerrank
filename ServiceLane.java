package hackerrank;

import java.util.*;

public class ServiceLane {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int n = in.nextInt();
		
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = in.nextInt();
		}
		List<Integer> res = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			int min = 3;
			for (int j = l; j <= r; j++) {
				min = arr[j] < min ? arr[j] : min;
			}
			res.add(min);
		}
		for (int i : res) {
			System.out.println(i);
		}
	}
}
