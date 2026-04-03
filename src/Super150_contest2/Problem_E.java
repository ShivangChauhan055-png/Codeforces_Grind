package Super150_contest2;

import java.util.*;

public class Problem_E{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double dis = 0;
        dis = arr[0];
        for(int i = 1; i < n; i++) {
            dis = Math.max(dis, (arr[i] - arr[i - 1]) / 2.0);
        }
        dis = Math.max(dis, l - arr[n - 1]);
        System.out.println(dis);
    }
}
