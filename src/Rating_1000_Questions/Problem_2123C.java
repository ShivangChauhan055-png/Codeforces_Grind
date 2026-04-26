package Rating_1000_Questions;

import java.util.*;

public class Problem_2123C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] prefixMin = new int[n];
            int[] suffixMax = new int[n];
            prefixMin[0] = arr[0];
            suffixMax[n-1] = arr[n-1];
            for(int i=1;i<n;i++){
                prefixMin[i] = Math.min(prefixMin[i-1],arr[i]);
            }
            for (int i = n-2; i >=0 ; i--) {
                suffixMax[i] = Math.max(suffixMax[i+1],arr[i]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if(arr[i]==prefixMin[i] || arr[i]==suffixMax[i]){
                    sb.append("1");
                }else sb.append("0");
            }
            System.out.println(sb);
        }
    }
}
