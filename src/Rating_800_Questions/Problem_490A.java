package Rating_800_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_490A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if(x==1) a.add(i);
            else if(x==2) b.add(i);
            else c.add(i);
        }
        int ans = Math.min(a.size(),Math.min(b.size(),c.size()));
        System.out.println(ans);
        for (int i = 0; i < ans; i++) {
            System.out.println(a.get(i)+" "+b.get(i)+" "+c.get(i));
        }
    }
}
