package Div2_7Aug;

import java.util.*;

public class Problem_B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] pref = new int[n];
            pref[0] = 1;
            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1];
                if (a[i] != a[i - 1]) pref[i]++;
            }
            int[] suff = new int[n];
            suff[n - 1] = 1;
            for(int i = n - 2; i >= 0; i--) {
                suff[i] = suff[i + 1];
                if(a[i] != a[i + 1]) suff[i]++;
            }
            int ans = pref[n - 1];
            for(int i = 0; i < n - 1; i++) {
                if(a[i] != a[i + 1]) {
                    int left = 0;
                    if(i > 0) {
                        left = pref[i - 1];
                        if(a[i - 1] == a[i + 1]) left--;
                    }
                    int right = 0;
                    if(i + 2 < n) {
                        right = suff[i + 2];
                        if(a[i + 2] == a[i]) right--;
                    }
                    ans = Math.max(ans, left + 2 + right);
                }
            }
            System.out.println(ans);
        }
    }
}
