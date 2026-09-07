package Div3_5Sep;

import java.util.*;
public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] cnt = new int[n+2];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] <= n) {
                    cnt[a[i]]++;
                }
            }
            if(cnt[0] == 0) {
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.print("A");
                }
                System.out.println();
            }else if (cnt[0] == 1) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
                int L = 0;
                while (cnt[L] >= 2) {
                    L++;
                }
                boolean[] A = new boolean[L];
                boolean[] B = new boolean[L];
                char[] ans = new char[n];
                for (int i = 0; i < n; i++) {
                    int v = a[i];
                    if(v< L) {
                        if(!A[v]) {
                            ans[i] = 'A';
                            A[v] = true;
                        }else if (!B[v]) {
                            ans[i] = 'B';
                            B[v] = true;
                        }else {
                            ans[i] = 'A';
                        }
                    }else {
                        ans[i] = 'C';
                    }
                }
                System.out.println(new String(ans));
            }
        }
    }
}
