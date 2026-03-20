package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1788A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int totalCount  =0;
            for (int i = 0; i < n; i++) {
                if(arr[i]==2) totalCount++;
            }
            int currentCount = 0;
            int ans =-1;
            for (int i = 0; i < n; i++) {
                if(arr[i]==2) currentCount++;
                if(currentCount==totalCount-currentCount){
                    ans = i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
