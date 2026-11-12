package Rating_1300_Questions;

import java.util.Scanner;

public class Problem_1479B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int k = n/2;
        if(n%2==0){
            ans = (k+1)*(k+1);
        }else{
            ans = 2*((k+1)*(k+2));
        }
        System.out.println(ans);
    }
}
