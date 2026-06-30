package Rating_800_Questions;

import java.util.Scanner;

public class Problem_200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double ans = 0;
        for (int i = 0; i < n; i++) {
            ans+= (arr[i]/(double)n);
        }
        System.out.printf("%.11f",ans);
    }
}
