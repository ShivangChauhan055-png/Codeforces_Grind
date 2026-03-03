package Div_3_15Feb;

import java.util.*;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int[] sort = a.clone();
            Arrays.sort(sort, 1, n + 1);
            boolean poss=true;
            for (int i = 1; i <= n; i++) {
                if(i%2==1){
                    ArrayList<Integer>ll1=new ArrayList<>();
                    ArrayList<Integer>ll2=new ArrayList<>();
                    int x=i;
                    while(x<=n){
                        ll1.add(a[x]);
                        ll2.add(sort[x]);
                        x*=2;
                    }
                    Collections.sort(ll1);
                    Collections.sort(ll2);
                    if(!ll1.equals(ll2)){
                        poss=false;
                        break;
                    }
                }
            }
            if(poss){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

