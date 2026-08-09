package Div2_9Aug;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long[] x = {a, b, c};
            Arrays.sort(x);
            a = x[0];
            b = x[1];
            c = x[2];
            if(c > a + b) System.out.println(b);
            else System.out.println(c - a);
        }
    }
}
