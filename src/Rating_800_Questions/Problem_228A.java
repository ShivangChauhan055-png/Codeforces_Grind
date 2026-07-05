package Rating_800_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class Problem_228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> s = new HashSet<>();
        for(int n : arr){
            s.add(n);
        }
        int ans = (4-s.size());
        System.out.println(ans);
    }
}
