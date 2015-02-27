package hackerrank;

import java.util.Scanner;

// Tn+2 = Tn+1^2 + Tn

public class FibonacciModified1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int q = in.nextInt();
		int n = in.nextInt();
		if (n == 1) {
			System.out.println(p);
			return;
		} else if (n == 2) {
			System.out.println(q);
			return;
		}
		String[] str = new String[n];
		str[0] = Integer.toString(p);
		str[1] = Integer.toString(q);

		for (int i = 2; i < n; i++) {
			str[i] = calculate(str[i - 2], str[i - 1]); 
			//System.out.println("i=" + i + " str[i]=" + str[i]);
		}
		System.out.print(str[n - 1]);
		/* the number is large enough that even long data type is not enough
		Scanner in = new Scanner(System.in);
		long p = in.nextInt();
		long q = in.nextInt();
		int n = in.nextInt();
		if (n == 1) {
			System.out.println(p);
			return;
		} else if (n == 2) {
			System.out.println(q);
			return;
		}
		long res = 0;
		for (int i = 3; i <= n; i++) {
			res = p + q * q;
			p = q;
			q = res;
		}
		System.out.println(res);
		*/
	}
	
	private static String calculate(String p, String q) {
		// q * q + p
		String product = multiply(q);
		//System.out.println("product=" + product + " p=" + p);
		String res = addStrings(product, p);
		//System.out.println("res=" + res);
		return res;
	}
	
	private static String multiply(String s) {
		if (s == null) {
            return null;
        }
        int len = s.length();
        int[] res = new int[2 * len];
        
        int j;
        for (int i = len - 1; i >= 0; i--) {
            int carry = 0;
            for (j = len - 1; j >= 0; j--) {
                int val2 = s.charAt(i) - '0';
                int val1 = s.charAt(j) - '0';
                int p = val1 * val2 + carry + res[i + j + 1];
                res[i + j + 1] = p % 10;
                carry = p / 10;
            }
            res[i + j + 1] = carry;
        }
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < res.length - 1 && res[index] == 0) {
            index++;
        }
        while (index < res.length) {
            sb.append(res[index]);
            index++;
        }
        return sb.toString();
	}
	
	private static String addStrings(String a, String b) {
		int la = a.length();
		int lb = b.length();
		int carry = 0;
		int[] res = new int[la + lb];
		
		for (int i = 0; i < Math.max(la, lb); i++) {
			int val1 = i >= la ? 0 : a.charAt(la - i - 1) - '0';
			int val2 = i >= lb ? 0 : b.charAt(lb - i - 1) - '0';
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			res[la + lb - i - 1] = sum % 10;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < la + lb; i++) {
			if (sb.length() == 0 && res[i] == 0) {
				continue;
			}
			sb.append(res[i]);
		}
		return sb.toString();
	}
}
