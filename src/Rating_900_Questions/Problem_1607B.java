package Rating_900_Questions;

import java.util.Scanner;
public class Problem_1607B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x = sc.nextLong();
            long n = sc.nextLong();
            if(n%4==0) System.out.println(x);
            else if (n%4==1) {
                if(x%2==0) x = x-n;
                else x = x+n;
                System.out.println(x);
            }else if(n%4==2){
                if(x%2==0) x= x+1;
                else x = x-1;
                System.out.println(x);
            }else{
                if(x%2==0) x = x+n+1;
                else x = x-n-1;
                System.out.println(x);
            }
        }
    }
}


