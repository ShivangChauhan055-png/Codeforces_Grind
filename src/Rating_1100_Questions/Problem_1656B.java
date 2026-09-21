package Rating_1100_Questions;

import java.util.*;

public class Problem_1656B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            boolean flag = false;
            for(int x : a){
                if(set.contains(x+k) || set.contains(x-k)){
                    flag = true;
                    break;
                }
                set.add(x);
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
