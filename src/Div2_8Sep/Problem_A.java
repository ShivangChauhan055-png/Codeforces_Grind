package Div2_8Sep;

import java.util.*;
public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int count0 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) {
                    count0++;
                }
            }
            if (count0 < 2) {
                System.out.println(-1);
            } else {
                int op = 0;
                if (a[0] == 1) op++;
                if (a[n - 1] == 1) op++;
                System.out.println(op);
            }
        }
    }
}
