package Rating_1100_Questions;

import java.util.Scanner;

public class Problem_1360C {
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
            for(int x : a){
                if(x%2==0) even++;
                else odd++;
            }
            if(even%2==0 && odd%2==0) System.out.println("YES");
            else{
                boolean found = false;
                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                        if(Math.abs(a[i]-a[j])==1){
                            found=true;
                            break;
                        }
                    }
                }
                if(found) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
