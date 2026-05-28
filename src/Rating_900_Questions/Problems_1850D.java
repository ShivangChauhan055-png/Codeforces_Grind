package Rating_900_Questions;

import java.util.*;
public class Problems_1850D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxi = 1;
            int curr = 1;
            for(int i=1;i<n;i++){
                if(arr[i]-arr[i-1]<=k) curr++;
                else curr = 1;
                maxi = Math.max(maxi,curr);
            }
            System.out.println(n-maxi);
        }
    }
}
