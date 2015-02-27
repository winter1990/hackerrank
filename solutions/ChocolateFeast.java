package hackerrank;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
    	long res = 0;
    	int cur = N / C;
    	res += cur;
    	int tmp;
    	while (cur >= M) {
    		tmp = cur / M;
    		res += tmp;
    		//cur %= M;
    		cur = cur - tmp * M + tmp;
    	}
    	return res;
    }
    /*
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			// # of candies: n/c
			int res = 0;
			int cur = n / c;
			while (cur > 0) {
				res += cur;
				if (cur < m) {
					break;
				}
				res += cur / m;
				cur %= m;
			}
			System.out.println(res);
		}
	}
	*/
}
