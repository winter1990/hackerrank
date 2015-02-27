package hackerrank;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] N = new int[T];
        for (int i = 0; i < T; i++) {
            N[i] = in.nextInt();
        }
        
        int height=1;
        
        for (int i = 0; i < N.length; i++) {
            height = 1;
            for (int j = 1; j <= N[i]; j++) {
                if ((j % 2) == 1) {
                    height = height * 2;
                } else {
                    height++;
                }
            }
            System.out.println(height);
        }
    }
}
