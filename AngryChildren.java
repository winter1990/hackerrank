package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class AngryChildren {
	static BufferedReader in = new BufferedReader(new InputStreamReader(
	         System.in));
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numPackets = Integer.parseInt(in.readLine());
		int numKids = Integer.parseInt(in.readLine());
		int[] packets = new int[numPackets];
      
		for (int i = 0; i < numPackets; i++) {
			packets[i] = Integer.parseInt(in.readLine());
		}
      
		int unfairness = Integer.MAX_VALUE;
      
		// Write your code here, to process numPackets N, numKids K, and the packets of candies
		// Compute the ideal value for unfairness over here
		unfairness = helper(packets, numKids);
		System.out.println(unfairness);
	}
   
	private static int helper(int[] arr, int k) {
		Arrays.sort(arr);
		int s = 0;
		int e = k - 1;
		int min = Integer.MAX_VALUE;
		while (e < arr.length) {
			int v = arr[e] - arr[s];
			min =  v < min ? v : min;
			s++;
			e++;
		}
		return min;
	}
}
