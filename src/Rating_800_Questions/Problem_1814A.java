package Rating_800_Questions;

import java.util.*;

public class Problem_1814A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
           long n = sc.nextLong();
           long k = sc.nextLong();
           if(n%2==0 || (n-k)%2==0){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
        }
    }
}
