package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_1411B {
     static boolean isfair(long d){
        long num = d;
        while(num>0){
            long ld = num%10;
            if(ld!=0 && d%ld!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            while(!isfair(n)) n++;
            System.out.println(n);
        }
    }
}
