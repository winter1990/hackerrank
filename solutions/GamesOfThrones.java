package hackerrank;

import java.util.*;

public class GamesOfThrones {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
       
        String ans;
        int len = input.length();
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : input.toCharArray()) {
        	if (map.containsKey(c)) {
        		map.put(c, map.get(c) + 1);
        	} else {
        		map.put(c, 1);
        	}
        }
        int count = 0;
        for (Integer i : map.values()) {
        	if (i % 2 == 1) {
        		count++;
        	}
        }
        ans = count > 1 ? "NO" : "YES";
        System.out.println(ans);
        in.close();
    }
}
