package Rating_1600_Questions;

import java.util.*;

public class Problem_735D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(prime(n)) System.out.println(1);
        else if(n%2==0) System.out.println(2);
        else if(prime(n-2)) System.out.println(2);
        else System.out.println(3);
    }
    public static boolean prime(int n ){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
