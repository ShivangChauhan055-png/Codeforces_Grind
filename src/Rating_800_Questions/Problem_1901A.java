package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n  = sc.nextInt();
            int x = sc.nextInt();
            int[] ele = new int[n];
            for (int i = 0; i < n; i++) {
                ele[i]=sc.nextInt();
            }
            int ans = ele[0];
            for(int i = 1;i<n;i++){
                ans = Math.max(ans,ele[i]-ele[i-1]);
            }
            ans = Math.max(ans , 2*(x-ele[n-1]));
            System.out.println(ans);
        }

    }
}
