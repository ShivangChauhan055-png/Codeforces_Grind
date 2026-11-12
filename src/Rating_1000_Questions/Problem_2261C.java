package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_2261C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int even = 0 , odd = 0;
            for(int i=0;i<n;i++){
                if(a[i]%2==0) even++;
                else odd++;
            }
            if((even==1 && odd==1) || (even==0 && odd==3)) System.out.println("Larpity");
            else System.out.println("Moggity");
        }
    }
}
