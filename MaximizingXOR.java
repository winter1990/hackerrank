package hackerrank;

import java.util.Scanner;

public class MaximizingXOR {
	static int maxXor(int l, int r) {
        int max = 0;
        for (int i = l; i < r; i++) {
        	for (int j = i + 1; j <= r; j++) {
        		int x = i ^ j;
        		max = Math.max(max, x);
        	}
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
