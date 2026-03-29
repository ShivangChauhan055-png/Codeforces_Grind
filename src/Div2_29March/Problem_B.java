package Div2_29March;

import java.util.Scanner;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            int ans = 0;
            for(int i = 0; i < n; i++){
                if(p[i] <= i+1){
                    ans++;
                } else {
                    continue;
                }
            }
            System.out.println(ans);
        }
    }
}
