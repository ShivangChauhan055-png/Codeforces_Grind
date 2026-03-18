package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1829B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int zeros = 0;
            int max_zero  = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i]==0) zeros++;
                else zeros =0;
                max_zero = Math.max(max_zero,zeros);
            }
            System.out.println(max_zero);
        }
    }
}
