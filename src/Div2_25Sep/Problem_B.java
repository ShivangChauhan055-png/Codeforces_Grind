package Div2_25Sep;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] f = new int[105];
            for(int i = 0; i < n; i++) {
                f[sc.nextInt()]++;
            }
            int c = 0;
            while(c < n) {
                for(int i = 100; i >= 1; i--) {
                    if(f[i] > 0) {
                        System.out.print(i + " ");
                        f[i]--;
                        c++;
                    }
                }
            }
            System.out.println();
        }
    }
}
