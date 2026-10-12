package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1475B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long count = n/2020;
            long rem = n%2020;
            if(rem<=count) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
