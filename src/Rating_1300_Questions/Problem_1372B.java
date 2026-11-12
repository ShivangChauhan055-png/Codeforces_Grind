package Rating_1300_Questions;

import java.util.Scanner;

public class Problem_1372B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(n/2+" "+n/2);
            }else{
                int ans = n;
                for(int i=2;i*i<=n;i++){
                    if(n%i==0){
                        ans = i;
                        break;
                    }
                }
                if(ans==n) System.out.println(n-1+" "+1);
                else{
                    ans = n/ans;
                    System.out.println(n-ans +" "+ ans);
                }
            }
        }
    }
}
