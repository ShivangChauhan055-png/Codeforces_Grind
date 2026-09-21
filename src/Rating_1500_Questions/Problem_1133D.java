package Rating_1500_Questions;

import java.util.*;

public class Problem_1133D {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        HashMap<String,Integer> mp = new HashMap<>();
        int zero = 0 , ans = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                if(b[i]==0){
                    zero++;
                }
                continue;
            }
            // d = -b[i] / a[i]
            int x = -b[i] , y = a[i];
            if(y<0){
                x = -x;
                y = -y;
            }
            int g = gcd(Math.abs(x),y);
            x /=g;
            y/=g;

            String ratio = x + "/"+y;
            int count = mp.getOrDefault(ratio,0)+1;
            mp.put(ratio,count);
            ans = Math.max(ans,count);


        }
        System.out.println(ans+zero);

    }
}
