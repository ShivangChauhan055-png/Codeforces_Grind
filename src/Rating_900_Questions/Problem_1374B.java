package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1374B {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            int a =0;
            int b =0;
            while(n%2==0){
                a++;
                n/=2;
            }
            while(n%3==0){
                b++;
                n/=3;
            }
            if(n!=1 || a>b) System.out.println(-1);
            else System.out.println(2*b-a);
        }
    }
}
