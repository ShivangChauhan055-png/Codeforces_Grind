package Div3_31Oct;

import java.util.Scanner;
import java.util.Arrays;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long m = a[n / 2];
            long c = 0;
            for(int i = 0; i < n; i++){
                c += Math.abs(a[i] - m);
            }
            long diff = a[n - 1] - a[0];
            System.out.println(c + " " + diff);
        }
    }
}
