package Rating_900_Questions;

import java.util.*;

public class Problem_1475A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            while(n%2==0){
                n/=2;
            }
            if(n>1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
