package Rating_1500_Questions;

import java.util.*;
public class Problem_670D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long low = 0 , high =Integer.MAX_VALUE;
        long ans = 0;
        while(low<=high){
            long mid = low+(high-low)/2;
            long powder = 0;
            boolean possible = true;
            for (int i = 0; i < n; i++) {
                long req = mid*a[i];
                if(b[i]<req) powder += req-b[i];
                if(powder>k) {
                    possible = false;
                    break;
                }
            }
            if(possible){
                ans = mid;
                low = mid+1;
            }else high = mid-1;

        }
        System.out.println(ans);
    }
}

