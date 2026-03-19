package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1866A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int op = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            op = Math.min(op,Math.abs(arr[i]));
        }
        System.out.println(op);
    }
}
