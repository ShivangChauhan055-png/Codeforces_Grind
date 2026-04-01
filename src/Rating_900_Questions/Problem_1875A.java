package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1875A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long min_time = b;
            for (int i = 0; i < n; i++) {
                min_time+=Math.min(arr[i],a-1);
            }
            System.out.println(min_time);
        }
    }
}
