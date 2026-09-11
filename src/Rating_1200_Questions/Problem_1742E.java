package Rating_1200_Questions;

import java.util.*;

public class Problem_1742E {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }

            long[] qrr = new long[q];
            for(int i=0; i<q; i++){
                qrr[i]=sc.nextLong();
            }

            long[] h = new long[n];
            h[0]=arr[0];
            for(int i=1; i<n; i++){
                h[i]=h[i-1]+arr[i];
            }

            long[] maxhs = new long[n];
            maxhs[0]=arr[0];
            for(int i=1; i<n; i++){
                maxhs[i]=Math.max(maxhs[i-1], arr[i]);
            }

            for(int i=0; i<q; i++){
                long curH = qrr[i];

                int l=0;
                int r=n-1;

                int idx=-1;

                while(l<=r){
                    int mid=l+(r-l)/2;

                    if(maxhs[mid]<=curH){
                        idx=mid;
                        l=mid+1;
                    }else{
                        r=mid-1;
                    }
                }

                if(idx==-1){
                    System.out.print(0+" ");
                }else{
                    System.out.print(h[idx]+" ");
                }
            }
            System.out.println();
        }
    }
}
