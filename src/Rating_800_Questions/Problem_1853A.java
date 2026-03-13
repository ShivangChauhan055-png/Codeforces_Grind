package Rating_800_Questions;

import java.util.*;

public class Problem_1853A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            long opr = Long.MAX_VALUE;
            for (int i = 0; i < n-1; i++) {
                if(arr[i]<=arr[i+1]){
                    long diff = arr[i+1]-arr[i];
                    long req_opr = (diff/2)+1;
                    opr = Math.min(opr,req_opr);
                }else{
                    opr = 0;
                }
            }
            System.out.println(opr);
        }
    }
}
