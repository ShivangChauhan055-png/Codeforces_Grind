package Div2_25Sep;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                p[x] = i % 2;
            }
            boolean ok = true;
            for(int i = n; i >= 2; i -= 2){
                if(p[i] == p[i-1]){
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
