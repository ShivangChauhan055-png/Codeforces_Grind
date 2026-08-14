package Rating_900_Questions;

import java.util.*;

public class Problem_1535B {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
//            int count =0;
//            for(int i=0;i<n;i++){
//                for(int j=i+1;j<n;j++){
//                    if(gcd(arr[i],2*arr[j])>1) count++;
//                }
//            }
//            System.out.println(count);
            int even = 0 , odd = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%2==0) even++;
                else odd++;
            }
            int count = (even*(even-1)/2 + even*odd);
            for(int i=0;i<n;i++){
                if(arr[i]%2!=0){
                    for(int j=i+1;j<n;j++){
                        if(arr[j]%2!=0 && gcd(arr[i],arr[j])>1) count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
