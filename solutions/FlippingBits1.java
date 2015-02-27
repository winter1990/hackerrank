package hackerrank;
import java.util.Scanner;

/*
You will be given a list of 32-bits unsigned integers. 
You are required to output the list of the unsigned integers you get 
by flipping bits in its binary representation (i.e. unset bits must be set, 
and set bits must be unset).
*/

public class FlippingBits1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*
    	Scanner in = new Scanner(System.in);
        int t;
        long p;
        t = in.nextInt();
        long res;
        for (int j = 0; j < t; j++) {
            p = in.nextInt();
            res = 0;
            res = ~p & 0xffffffff;
            System.out.println(res);
        }
        */
    	Scanner in = new Scanner(System.in);
        int t;
        int p;
        t = in.nextInt();
        long res;
        for (int j = 0; j < t; j++) {
            p = in.nextInt();
            res = 0;
            for (int i = 0; i < 32; i++) {
            	if ((p >> i & 1) == 0) {
            		res += Math.pow(2, i);
            	}
            }
            System.out.println(res);
        }
    }
}

/* input
35
2672014991
1499569351
1311372904
2303009914
2960334500
2927976771
3629382734
464186945
612404077
3668887895
2085824650
4237702854
2802238250
2191461270
2304633523
2027954928
2014324209
524717694
2199485252
4237816651
1147350137
2115872316
4017650171
3579839067
2199661792
4275082781
1219763017
2337092616
2218314924
4050022241
3819953284
4257660940
4226888946
3538874864
1149715520

output:
1622952304
2795397944
2983594391
1991957381
1334632795
1366990524
665584561
3830780350
3682563218
626079400
2209142645
57264441
1492729045
2103506025
1990333772
2267012367
2280643086
3770249601
2095482043
57150644
3147617158
2179094979
277317124
715128228
2095305503
19884514
3075204278
1957874679
2076652371
244945054
475014011
37306355
68078349
756092431
3145251775
*/