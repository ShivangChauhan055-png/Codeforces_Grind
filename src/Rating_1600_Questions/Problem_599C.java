package Rating_1600_Questions;

import java.util.*;

public class Problem_599C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Map<Integer,Integer> mp = new HashMap<>();
//        for(int x : a){
//            mp.put(x,mp.getOrDefault(x,0)+1);
//        }

        int[] b = Arrays.copyOf(a, n);
        Arrays.sort(b);
        int ans=0;
        int count = 0;
        for(int i=0;i<n;i++){
            if (mp.getOrDefault(a[i],0)==0){
                count++;
            }
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            if (mp.getOrDefault(a[i],0)==0){
                count--;
            }
            if (mp.getOrDefault(b[i],0)==0){
                count++;
            }
            mp.put(b[i],mp.getOrDefault(b[i],0)-1);
            if (mp.getOrDefault(b[i],0)==0){
                count--;
            }
            if (count==0)ans++;
        }
        System.out.println(ans);
    }

}
