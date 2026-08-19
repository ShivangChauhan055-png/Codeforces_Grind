package Rating_900_Questions;

import java.util.Scanner;
public class Problem_1607B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            if(n%4==0) System.out.println(x);
            else if(n%4==1){
                System.out.println((x%2==0) ? x-n : x+n);
            } else if (n%4==2) {
                System.out.println((x%2==0) ? x+1 : x-1);
            } else if (n%4==3) {
                System.out.println((x%2==0) ? x+n+1 : x-n-1);
            }
        }
    }
}


