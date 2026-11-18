package Rating_1000_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_2185C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int count = 1 , ans = 1;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1]) continue;
                if(a[i]==a[i-1]+1){
                    count++;
                }else count = 1;
                ans = Math.max(ans,count);
            }
            System.out.println(ans);
        }
    }
}
