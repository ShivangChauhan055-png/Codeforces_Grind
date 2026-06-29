package Rating_800_Questions;

import java.util.Scanner;

public class Problem_977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            if(n%10 !=0) n--;
            else if (n%10 == 0) n/=10;
        }
        System.out.println(n);
    }
}
