package Rating_800_Questions;

import java.util.*;
public class Problem_1903A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-- >0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long[] copy_arr = Arrays.copyOf(arr, arr.length);
            Arrays.sort(copy_arr);
            if(Arrays.equals(copy_arr,arr) || k>1 ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
