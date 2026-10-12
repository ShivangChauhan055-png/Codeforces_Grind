package Rating_900_Questions;

import java.util.Scanner;

public class Problem_2271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b>a+1) System.out.println(-1);
            else if(a%2==b%2) System.out.println(a);
            else System.out.println(a+1);
        }
    }
}
