package Div_2_16March;

import java.util.*;
public class Problem_C {
    static long gcd(long a,long b){
        while(b!=0){
            long temp =b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long m=sc.nextLong();

            long Alice = m/a;
            long Bob = m/b;
            long Carol = m/c;

            long AB = m/lcm(a,b);
            long AC = m/lcm(a,c);
            long BC = m/lcm(b,c);

            long ABC = m/lcm(lcm(a,b),c);

            long only_A = Alice - AB - AC + ABC;
            long only_B = Bob - AB - BC + ABC;
            long only_C = Carol - AC - BC + ABC;

            long alice = only_A*6 + (AB-ABC)*3 + (AC-ABC)*3 + ABC*2;
            long bob   = only_B*6 + (AB-ABC)*3 + (BC-ABC)*3 + ABC*2;
            long carol = only_C*6 + (AC-ABC)*3 + (BC-ABC)*3 + ABC*2;

            System.out.println(alice+" "+bob+" "+carol);
        }
    }
}
