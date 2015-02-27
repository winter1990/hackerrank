package hackerrank;

import java.util.*;
/*
这题有点巧妙。。深度搜索每条路径，然后枚举，O(nlogn)，但是关键在于这样肯定超时。
巧妙之处在于要给每条路径建立一个线段树来加速查询，每次similar查询复杂度从O(h)变成O(lgh)

犯了两个错误
要用long来存储线段树，以及可能的similar pairs。
值减去T可能小于0，值加上T也有可能大于n。
*/

public class Q_SimilarPair {
	public static LinkedList<Integer>[] nodes = new LinkedList[100002];
	// n total # of nodes in the tree (1,2,...,n)
	// t abs(A-B) <= T
	static int n , t, root;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	n = scan.nextInt();
    	t = scan.nextInt();
    	// why 4*n+1?
    	long[] stree = new long[4 * n + 1];
    	
    	for (int i = 1; i <= n; i++) {
    		nodes[i] = new LinkedList<Integer>();
    	}
    	int[] idegree = new int[n + 1];
    	
    	for (int i = 1; i < n; i++) {
    		int par = scan.nextInt();
    		int chd = scan.nextInt();
    		
    		nodes[par].addFirst(chd);
    		idegree[chd]++;
    	}
    	
    	for (int i = 1; i <= n; i++) {
    		if (idegree[i] == 0) {
    			root = i;
    			break;
    		}
    	}
    	
    	long[] pairs = new long[1];
    	
    	depthSearch(root, stree, pairs);
    	System.out.println(pairs[0]);
	}
    
	public static void depthSearch(int nodeval, long[] stree, long[] pairs){
    	int min = (nodeval - t < 1) ? 1 : nodeval - t;
    	int max = (nodeval + t > n) ? n : nodeval + t;
    	pairs[0] += query(stree, 1, 1, n, min, max);    	
    	updateTree(stree, 1, 1, n, nodeval, 1);
    	
    	for (int chd : nodes[nodeval]) {
    		depthSearch(chd, stree, pairs);
    	}
    	updateTree(stree, 1, 1, n, nodeval, -1);
    }
    
    public static void updateTree(long[] tree, int node, int tl, int tr, int val, long opt) {
    	if(val < tl || val > tr || tl > tr) {
    		return;
    	}
    	tree[node] += opt;
    		
    	int m = (tl + tr) >> 1;
    		
    	if (tl == tr) {
    		return;
    	} else if (val <= m) {
    		updateTree(tree,node<<1,tl,m,val,opt);
    	} else {
    		updateTree(tree,node<<1|1,m+1,tr,val,opt);
    	}
    }
   
    public static long query(long[] tree, int node, int tl, int tr, int min, int max){
    	if (max < tl || min > tr) {
    		return 0;
    	} else if (max == tr && min == tl) {
    		return tree[node];
    	} else {
    		int mid = (tl + tr) >> 1;
    		int lmax = (mid < max) ? mid : max;
    		int rmin = (min > mid) ? min : mid + 1;
    		return query(tree, node << 1, tl, mid, min, lmax) + 
    				query(tree, node <<1 | 1, mid + 1, tr, rmin, max);
    	}
    }
}
