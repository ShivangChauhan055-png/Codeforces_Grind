package Rating_800_Questions;

import java.util.Scanner;

public class Problem_996A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
        long[] a ={100,20,10,5,1};
        int ans = 0;
        for(int i=0;i<a.length;i++){
            if(n>=a[i]){
                ans+= (int) (n/a[i]);
            }
            n%=a[i];
        }
        System.out.println(ans);
    }
}
