package Rating_1200_Questions;

import java.util.Scanner;

public class Problem_2196A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long p = sc.nextLong();
            long q = sc.nextLong();
            long d = q-p;
            if(d>0 && p>=2*d) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
