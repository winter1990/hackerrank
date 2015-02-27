package hackerrank;

import java.util.Scanner;

public class InsertionSortPart1 {
	public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
        int len = ar.length;
        if (len == 1) {
        	printArray(ar);
        }
        for (int i = 1; i < len; i++) {
            if (ar[i] < ar[i - 1]) {
                int index = i - 1;
                int tmp = ar[i];
                while (index >= 0 && ar[index] > tmp) {
                    ar[index + 1] = ar[index];
                    printArray(ar);
                    index--;
                }
                ar[index + 1] = tmp;
                printArray(ar);
            }
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
