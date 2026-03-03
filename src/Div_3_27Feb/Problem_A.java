package Div_3_27Feb;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int m = sc.nextInt();
            int[] a = new int[m];
            int Maximum = 0;
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
                Maximum = Math.max(Maximum, a[i]);
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                if (a[i] == Maximum) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
