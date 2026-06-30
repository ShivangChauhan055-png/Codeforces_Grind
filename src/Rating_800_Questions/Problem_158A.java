package Rating_800_Questions;

import java.util.Scanner;

public class Problem_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int score = arr[k-1];
        for(int z : arr){
            if(z>0 && z>=score) count++;
        }
        System.out.println(count);
    }
}
