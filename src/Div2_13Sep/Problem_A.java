package Div2_13Sep;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            int[] wrong = new int[n];
            int count = 0;
            for(int i = 1; i <= n; i++){
                p[i] = sc.nextInt();
                if(p[i] != i) {
                    wrong[count++] = i;
                }
            }
            boolean ok = true;
            for(int i = 0; i < count; i++){
                int tI = wrong[i];
                int sI = wrong[count - 1 - i];

                if(p[sI] != tI){
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
