package Rating_800_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_1669B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean yes = false;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<n-2;i++){
                if(a[i]==a[i+2]){
                    yes = true;
                    ans = a[i];
                    break;
                }
            }
            if(yes) System.out.println(ans);
            else System.out.println(-1);
        }
    }
}
