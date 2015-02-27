package hackerrank;

import java.util.*;

// at first, taking some examples, it must be 2 or 4 nodes
// if 2: must be like a linked list
// if 4:  (1,2,3,4) or (1,2,#,3,#,4,#)? NO. so must be (1,2,#,3,4)
// but might be multiple children: (1,234)

// define Node class: int val, List children, 

public class Q_EvenTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // # of nodes
		int m = in.nextInt(); // # of edges
		// 2 1 => 1 is parent of 2 
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < m; i++) {
			int p = in.nextInt();
			int q = in.nextInt();
			if (map.containsKey(q)) {
				map.get(q).add(p);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(p);
				map.put(q, list);
			}
		}
	}
}
