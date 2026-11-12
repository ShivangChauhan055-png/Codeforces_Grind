package Rating_800_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_1360B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int mini = Integer.MAX_VALUE;
            for(int i=n-1;i>0;i--){
                int diff = a[i]-a[i-1];
                mini = Math.min(mini,diff);
            }
            System.out.println(mini);
        }
    }
}
