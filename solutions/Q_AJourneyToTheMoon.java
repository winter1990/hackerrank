package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q_AJourneyToTheMoon {
	public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);
      
        
        List<Set<Integer>> set = new ArrayList<Set<Integer>>();
        for (int i = 0; i < I; i++){
        	temp = bfr.readLine().split(" ");
        	int a = Integer.parseInt(temp[0]);
        	int b = Integer.parseInt(temp[1]);
        	boolean flag = false;;
        	for (Set<Integer> subset : set) {
        		if (subset.contains(a) || subset.contains(b)) {
        			subset.add(a);
        			subset.add(b);
        			flag = true;
        			break;
        		}
        	}
        	if (!flag) {
	        	Set<Integer> s = new HashSet<Integer>();
				s.add(a);
				s.add(b);
				set.add(s);
        	}
        }
        
        combine(set);
        
        long combinations = 0;
        
        int index = 0;
        int total = 0; // actual total number is N
        for (Set<Integer> sub : set) {
        	total += sub.size();
        }
        int single = N - total;
        
        int[] arr = new int[single + set.size()];
        for (Set<Integer> subset : set) {
        	//System.out.println(subset);
        	arr[index++] = subset.size();
        	//System.out.println(subset);
        }
        while (index < arr.length) {
        	arr[index++] = 1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
        	for (int j = i + 1; j < arr.length; j++) {
        		long val = arr[i] * arr[j];
        		combinations += val;
        	}
        }
        System.out.println(combinations);
    }
	
	private static void combine(List<Set<Integer>> set) {
		//List<Set<Integer>> res = new ArrayList<Set<Integer>>(set);
		//System.out.println("res=" + res);
		
		for (int i = 0; i < set.size() - 1; i++) {
			Set<Integer> sub1 = set.get(i);
			for (int j = i + 1; j < set.size(); j++) {
				Set<Integer> sub2 = set.get(j);
				for (int elem : sub2) {
					if (sub1.contains(elem)) {
						sub1.addAll(sub2);
						set.remove(sub2);
					}
				}
			}
		}
	}
}
