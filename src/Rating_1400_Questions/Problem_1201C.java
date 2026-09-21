package Rating_1400_Questions;

import java.util.*;

public class Problem_1201C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long l = arr[n/2];
        long h = arr[n/2]+k;
        long ans = 0;
        while(l<=h){
            long median = l+(h-l)/2;
            if(check(arr,median,k)){
                ans = median;
                l = median+1;
            }else h = median-1;

        }
        System.out.println(ans);
    }
    public static boolean check(long[] arr,long median,long k){
        int n = arr.length;
        long moves = 0;
        for(int i=n/2;i<n;i++){
            if(arr[i]<median){
                moves += (median-arr[i]);
            }
        }
        if(moves>k) return false;
        return true;
    }
}
