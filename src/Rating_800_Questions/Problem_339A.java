package Rating_800_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] nums = s.split("\\+");
        Arrays.sort(nums);
        System.out.println(String.join("+",nums));
    }
}
