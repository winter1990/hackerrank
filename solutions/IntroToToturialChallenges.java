package hackerrank;

import java.util.Scanner;

public class IntroToToturialChallenges {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int len = in.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = in.nextInt();
		}
        
		int s = 0, e = len - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == target) {
				System.out.println(mid);
				break;
			} else if (arr[mid] > target) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
    }
}
