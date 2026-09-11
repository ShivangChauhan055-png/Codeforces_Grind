package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1669C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean even1 = false , odd1 = false , even2=false, odd2 =false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(i%2==0){
                    if(a[i]%2==0) even1 = true;
                    else odd1 = true;
                }else{
                    if(a[i]%2==0) even2=true;
                    else odd2 = true;
                }
            }
            if(even1 && odd1) System.out.println("No");
            else if(even2 && odd2) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
